package dating.service.MAIN;

//<editor-fold defaultstate="collapsed" desc="IMPORT">
import dating.service.DTO.AdvertiserDTO;
import dating.service.DTO.AdvertiserReplyDTO;
import dating.service.DTO.PartnerSoughtDTO;
import dating.service.DTO.ResponderDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//</editor-fold>

public class DatingService {

    //<editor-fold defaultstate="collapsed" desc="INIT">
    List<AdvertiserDTO> advertiserList = new ArrayList<>();
    List<ResponderDTO> responderList = new ArrayList<>();
    //</editor-fold>

    public static void main(String[] args) {

        DatingService datingService = new DatingService();

        //<editor-fold defaultstate="collapsed" desc="INIT LIST ADVERTISER">
        datingService.initListAdvertiser();
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="INIT LIST RESPONDER">
        datingService.initListResponder();
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="SHOW LIST ACCOUNT RESPONDER">
        datingService.showListAccountResponder();
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="LOGIN RESPONDER TO MATCHES">
        for (ResponderDTO responderDTO : datingService.responderList) {
            System.out.println("STEP B: FIND MATCHES FOR RESPONDER " + responderDTO.getUserName());
            System.out.println("--------------------------------------");
            datingService.loginResponder(responderDTO);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="SHOW ALL ADVERTISERS REGISTERED">
        datingService.showAllAdvertisers();
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="SHOW ALL RESPONDERS REGISTERED">
        datingService.showAllResponders();
        //</editor-fold>
    }

    //<editor-fold defaultstate="collapsed" desc="INIT LIST ADVERTISER">
    public void initListResponder() {

        AdvertiserDTO advertiserDTO = new AdvertiserDTO();
        System.out.println("STEP A: CREATE LIST CUSTOMER");
        System.out.println("-----------------------------");

        // 1
        PartnerSoughtDTO partnerSoughtDTO = new PartnerSoughtDTO();
        partnerSoughtDTO.setGender("female");
        partnerSoughtDTO.setMinAge(20);
        partnerSoughtDTO.setMaxAge(30);
        partnerSoughtDTO.setMinIncome(20000f);
        partnerSoughtDTO.setMaxIncome(30000f);

        advertiserDTO.setUserName("advertiser 1");
        advertiserDTO.setPassword("advertiser");
        advertiserDTO.setGender("male");
        advertiserDTO.setAge(20);
        advertiserDTO.setIncome(20000f);
        advertiserDTO.setAdvertDescription("Hello! I'm advertiser 1");
        advertiserDTO.setPartnerSought(partnerSoughtDTO);

        // 2
        partnerSoughtDTO.setGender("male");
        partnerSoughtDTO.setMinAge(30);
        partnerSoughtDTO.setMaxAge(40);
        partnerSoughtDTO.setMinIncome(30000f);
        partnerSoughtDTO.setMaxIncome(40000f);

        advertiserDTO.setUserName("advertiser 2");
        advertiserDTO.setPassword("advertiser");
        advertiserDTO.setGender("female");
        advertiserDTO.setAge(30);
        advertiserDTO.setIncome(30000f);
        advertiserDTO.setAdvertDescription("Hello! I'm advertiser 2");
        advertiserDTO.setPartnerSought(partnerSoughtDTO);

        // 3
        partnerSoughtDTO.setGender("female");
        partnerSoughtDTO.setMinAge(40);
        partnerSoughtDTO.setMaxAge(50);
        partnerSoughtDTO.setMinIncome(40000f);
        partnerSoughtDTO.setMaxIncome(50000f);

        advertiserDTO.setUserName("advertiser 3");
        advertiserDTO.setPassword("advertiser");
        advertiserDTO.setGender("male");
        advertiserDTO.setAge(40);
        advertiserDTO.setIncome(40000f);
        advertiserDTO.setAdvertDescription("Hello! I'm advertiser 3");
        advertiserDTO.setPartnerSought(partnerSoughtDTO);

        advertiserList.add(advertiserDTO);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INIT LIST RESPONDER">
    public void initListAdvertiser() {

        ResponderDTO responderDTO = new ResponderDTO();

        // 1
        responderDTO.setUserName("responder 1");
        responderDTO.setPassword("responder");
        responderDTO.setGender("male");
        responderDTO.setAge(20);
        responderDTO.setIncome(20000f);
        responderList.add(responderDTO);

        // 2
        responderDTO.setUserName("responder 2");
        responderDTO.setPassword("responder");
        responderDTO.setGender("female");
        responderDTO.setAge(30);
        responderDTO.setIncome(30000f);
        responderList.add(responderDTO);

        // 3
        responderDTO.setUserName("responder 3");
        responderDTO.setPassword("responder");
        responderDTO.setGender("male");
        responderDTO.setAge(40);
        responderDTO.setIncome(40000f);

        responderList.add(responderDTO);

    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW LIST ACCOUNT RESPONDER">
    public void showListAccountResponder() {
        
        System.out.println("LIST ACCOUNT RESPONDER");
        System.out.println("-----------------------");
        for (int ri = 0; ri < responderList.size(); ri++) {
            System.out.println(ri + 1 + ") User name: " + responderList.get(ri).getUserName() + " Pass word: " + responderList.get(ri).getPassword());
        }
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LOGIN RESPONDER TO MATCHES">
    public Boolean loginResponder(ResponderDTO responderDTO) {

        System.out.println("Responder " + responderDTO.getUserName() + " login succed: ");
        
        // Get list matches advertiser
        List<AdvertiserDTO> advertiserMatchList = new ArrayList<>();
        for (AdvertiserDTO advertiserDTO : advertiserList) {
            if (responderDTO.getGender().equals(advertiserDTO.getPartnerSought().getGender())
                    && (responderDTO.getAge() >= advertiserDTO.getPartnerSought().getMinAge() && responderDTO.getAge() <= advertiserDTO.getPartnerSought().getMaxAge())
                    && (responderDTO.getIncome() >= advertiserDTO.getPartnerSought().getMinIncome() && responderDTO.getIncome() <= advertiserDTO.getPartnerSought().getMaxIncome())
                    ) {
                advertiserMatchList.add(advertiserDTO);
            }
        }
        
        if (advertiserMatchList.isEmpty()) {
            return false;
        }
        
        showListAdvertiserMatches(advertiserMatchList);
        chooseAdvertiseMatch(advertiserMatchList, responderDTO);
        
        return true;
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW LIST ADVERTISER MATCHES">
    public void showListAdvertiserMatches(List<AdvertiserDTO> advertiserMatchList){
        
        System.out.println("SHOW LIST ADVERTISER MATCHES");
        System.out.println("----------------------------");
        
        for (int ai = 0; ai < advertiserMatchList.size(); ai++) {
            System.out.println(ai + 1 + " User name: " + advertiserMatchList.get(ai).getUserName() + " Age: " + advertiserMatchList.get(ai).getAge());
        }
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CHOOSE ADVERTISER MATCHE">
    public void chooseAdvertiseMatch(List<AdvertiserDTO> advertiserMatchList, ResponderDTO responderDTO) {
        
        String numberAdvertise = "";
        for (int ai = 0; ai < advertiserMatchList.size(); ai++) {
            numberAdvertise += ai + 1 + " ";
        }
        
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        Integer numberAd = 0;
        while (!isExist) {
            System.out.print("Please choose advertiser with numbervariable : " + numberAdvertise);
            numberAd = Integer.parseInt(scanner.nextLine());
            if (numberAd > 0 && numberAd <= advertiserMatchList.size()) {
                isExist = true;
            }
        }
        
        // Send message to advertiser choosed
        String message = "";
        while ("".equals(message)) {
            System.out.println("Please input message not null: ");
            message = scanner.nextLine();
        }
        
        // Add responder's message to advertise be choosed
        AdvertiserDTO advertiserMatchDTO = advertiserMatchList.get(numberAd);
        AdvertiserReplyDTO advertiserReplyDTO = new AdvertiserReplyDTO();
        advertiserReplyDTO.setResponders(responderDTO);
        advertiserReplyDTO.setMessage(message);
        advertiserMatchDTO.getAdvertiserReplyList().add(advertiserReplyDTO);
        
        // Login advertise be matched
        loginAdvertiser(advertiserMatchDTO);
        
        // Create customer
        createCustomer();
        
        // Show all customers
        showAllCustomer();
        
        // Delete customer
        deleteCustomer();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LOGIN ADVERTISER TO GET MESSAGE">
    public void loginAdvertiser(AdvertiserDTO advertiserDTO) {
        
        System.out.println("SHOW ALL MESSAGE");
        System.out.println("-----------------");
        for (int mi = 0 ; mi < advertiserDTO.getAdvertiserReplyList().size(); mi++) {
            AdvertiserReplyDTO advertiserReplyDTO = advertiserDTO.getAdvertiserReplyList().get(mi);
            System.out.println(mi + 1 + ") Username: " + advertiserReplyDTO.getResponders().getUserName() + " Message: " + advertiserReplyDTO.getMessage());
        }
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CREATE CUSTOMER">
    public void createCustomer() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("STEP C: CREATE CUSTOMER");
        System.out.println("------------------------");
        
        boolean isExit = false;
        Integer numAd = 1;
        while (!isExit) {
            System.out.print("Please input 1[create advertiser] or 2[create responder]: ");
            numAd = Integer.parseInt(scanner.nextLine());
            if (numAd == 1 || numAd == 2) {
                isExit = true;
            }
        }
        
        if (numAd == 1) {
            createAdvertise();
        }
        
        if (numAd == 2) {
            createResponder();
        }
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CREATE ADVERTISE">
    public void createAdvertise() {
        
        Scanner scanner = new Scanner(System.in);
        AdvertiserDTO advertiserDTO = new AdvertiserDTO();
        PartnerSoughtDTO partnerSoughtDTO = new PartnerSoughtDTO();
        
        String username = "";
        while ("".equals(username)) {
            System.out.print("Please input user name not null: ");
            username = scanner.nextLine();
        }
        
        String password = "";
        while ("".equals(password)) {
            System.out.print("Please input pass word not null: ");
            password = scanner.nextLine();
        }
        
        String gender = "";
        while (!"male".equals(gender) && !"female".equals(gender)) {
            System.out.print("Please input gender is male or female: ");
            gender = scanner.nextLine();
        }
        
        Integer age = -1;
        while (age < 0) {
            System.out.print("Please input age: ");
            age = Integer.parseInt(scanner.nextLine());
        }
        
        float income = -1f;
        while (income < 0) {
            System.out.print("Please input income: ");
            income = Float.parseFloat(scanner.nextLine());
        }
        
        System.out.println("INPUT INFORMATION PARTNER SOUGHT");
        String genderWant = "";
        while(!"male".equals(genderWant) && !"female".equals(genderWant)) {
            System.out.print("Please input gender which you want: ");
            genderWant = scanner.nextLine();
        }
        
        Integer minAgeWant = -1;
        while(minAgeWant < 0) {
            System.out.print("Please input min age which you want: ");
            minAgeWant = Integer.parseInt(scanner.nextLine());
        }
        
        Integer maxAgeWant = -1;
        while(maxAgeWant < 0) {
            System.out.print("Please input max age which you want: ");
            maxAgeWant = Integer.parseInt(scanner.nextLine());
        }
        
        float minIncomeWant = -1f;
        while(minIncomeWant < 0) {
            System.out.print("Please input min income which you want: ");
            minIncomeWant = Integer.parseInt(scanner.nextLine());
        }
        
        float maxIncomeWant = -1f;
        while(maxIncomeWant < 0) {
            System.out.print("Please input max income which you want: ");
            maxIncomeWant = Integer.parseInt(scanner.nextLine());
        }
        
        partnerSoughtDTO.setGender(genderWant);
        partnerSoughtDTO.setMinAge(minAgeWant);
        partnerSoughtDTO.setMaxAge(maxAgeWant);
        partnerSoughtDTO.setMinIncome(minIncomeWant);
        partnerSoughtDTO.setMaxIncome(maxIncomeWant);
        
        advertiserDTO.setUserName(username);
        advertiserDTO.setPassword(password);
        advertiserDTO.setGender(gender);
        advertiserDTO.setAge(age);
        advertiserDTO.setIncome(income);
        advertiserDTO.setPartnerSought(partnerSoughtDTO);
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CREATE RESPONDER">
    public void createResponder() {
        
        Scanner scanner = new Scanner(System.in);
        ResponderDTO responderDTO = new ResponderDTO();
        
        String username = "";
        while ("".equals(username)) {
            System.out.print("Please input user name not null: ");
            username = scanner.nextLine();
        }
        
        String password = "";
        while ("".equals(password)) {
            System.out.print("Please input pass word not null: ");
            password = scanner.nextLine();
        }
        
        String gender = "";
        while (!"male".equals(gender) && !"female".equals(gender)) {
            System.out.print("Please input gender is male or female: ");
            gender = scanner.nextLine();
        }
        
        Integer age = -1;
        while (age < 0) {
            System.out.print("Please input age: ");
            age = Integer.parseInt(scanner.nextLine());
        }
        
        float income = -1f;
        while (income < 0) {
            System.out.print("Please input income: ");
            income = Float.parseFloat(scanner.nextLine());
        }
        
        responderDTO.setUserName(username);
        responderDTO.setPassword(password);
        responderDTO.setGender(gender);
        responderDTO.setAge(age);
        responderDTO.setIncome(income);
        
        responderList.add(responderDTO);
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW ALL CUSTOMER">
    public void showAllCustomer() {
        
        System.out.println("SHOW ALL CUSTOMER");
        System.out.println("------------------");
        
        int ai = 0;
        for (ai = 0; ai < advertiserList.size(); ai++) {
            System.out.println(ai + 1 + " User name: " + advertiserList.get(ai).getUserName() + " Age: " + advertiserList.get(ai).getAge());
        }
        
        for (int ri = 0; ri < responderList.size(); ri++) {
            System.out.println(ai + 1 + " User name: " + responderList.get(ri).getUserName() + " Age: " + responderList.get(ri).getAge());
        }
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DELETE CUSTOMER">
    public void deleteCustomer() {
        
        Scanner scanner = new Scanner(System.in);
        Integer numCustomer = 0;
        
        System.out.println("STEP D: DELETE CUSTOMER");
        System.out.println("-----------------------");
        
        while(numCustomer <= 0) {
            System.out.print("Please input NO customer you want delete: ");
            numCustomer = Integer.parseInt(scanner.nextLine());
        }
        
        if (numCustomer <= advertiserList.size()) {
            advertiserList.remove(numCustomer - 1);
        }
        
        if (numCustomer > advertiserList.size()) {
            responderList.remove(numCustomer - advertiserList.size() - 1);
        }
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SHOW ALL ADVERTISERS REGISTERED">
    public void showAllAdvertisers() {
        
        System.out.println("STEP E: SHOW DETAL ALL ADVERTISER REGISTED");
        System.out.println("-------------------------------------------");
        
        for (int ri = 0; ri < advertiserList.size(); ri++) {
            System.out.println("----- NUMBER " + ri + 1 + " -----");
            System.out.println("User name: " + advertiserList.get(ri).getUserName());
            System.out.println("Gender: " + advertiserList.get(ri).getGender());
            System.out.println("Age: " + advertiserList.get(ri).getAge());
            System.out.println("Income: " + advertiserList.get(ri).getIncome());
            System.out.println("Gender match: " + advertiserList.get(ri).getPartnerSought().getGender());
            System.out.println("Range age match: [" + advertiserList.get(ri).getPartnerSought().getMinAge() + " - " + advertiserList.get(ri).getPartnerSought().getMinAge() + "]");
            System.out.println("Range income match: [" + advertiserList.get(ri).getPartnerSought().getMinIncome()+ " - " + advertiserList.get(ri).getPartnerSought().getMaxIncome()+ "]");
            System.out.println("SHOW LIST MESSAGE");
            for (int mi = 0; mi < advertiserList.get(ri).getAdvertiserReplyList().size(); mi++) {
                AdvertiserReplyDTO advertiserReplyDTO = advertiserList.get(ri).getAdvertiserReplyList().get(mi);
                System.out.println("MESSAGE " + mi + 1);
                System.out.println("User name: " + advertiserReplyDTO.getResponders().getUserName());
                System.out.println("Gender: " + advertiserReplyDTO.getResponders().getGender());
                System.out.println("Age: " + advertiserReplyDTO.getResponders().getAge());
                System.out.println("Income: " + advertiserReplyDTO.getResponders().getIncome());
                System.out.println("Content message:" + advertiserReplyDTO.getMessage());
            }
        }
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SHOW ALL RESPONDERS REGISTERED">
    public void showAllResponders() {

        System.out.println("STEP F: SHOW DETAIL ALL RESPONDER REGISTED");
        System.out.println("------------------------------------------");
        
        for (int ri = 0; ri < responderList.size(); ri++) {
            System.out.println("----- NUMBER " + ri + 1 + " -----");
            System.out.println("User name: " + responderList.get(ri).getUserName());
            System.out.println("Gender: " + responderList.get(ri).getGender());
            System.out.println("Age: " + responderList.get(ri).getAge());
            System.out.println("Income: " + responderList.get(ri).getIncome());
        }
        
    }
    //</editor-fold>

}
