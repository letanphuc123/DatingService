package dating.service.MAIN;

import dating.service.DTO.AdvertiserDTO;
import dating.service.DTO.ResponderDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        //<editor-fold defaultstate="collapsed" desc="LOGIN RESPONDER TO MATCHES">
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="LOGIN ADVERTISER TO GET MESSAGE">
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="CREATE CUSTOMER">
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="DELETE CUSTOMER">
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="SHOW ALL ADVERTISERS REGISTERED">
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="SHOW ALL RESPONDERS REGISTERED">
        
        //</editor-fold>
        
    }
    
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
    
    //<editor-fold defaultstate="collapsed" desc="INIT LIST RESPONDER">
    public void initListResponder() {
        
        AdvertiserDTO advertiserDTO = new AdvertiserDTO();
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LOGIN RESPONDER TO MATCHES">
    public void loginResponder() {
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LOGIN ADVERTISER TO GET MESSAGE">
    public void loginAdvertiser() {
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CREATE CUSTOMER">
    public void createCustomer() {
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DELETE CUSTOMER">
    public void deleteCustomer() {
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW ALL ADVERTISERS REGISTERED">
    public void showAllAdvertisers() {
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SHOW ALL RESPONDERS REGISTERED">
    public void showAllResponders() {
        
    }
    //</editor-fold>
    
}
