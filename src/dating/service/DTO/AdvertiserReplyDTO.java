package dating.service.DTO;

public class AdvertiserReplyDTO {
    
    public ResponderDTO Responders;
    public String Message;

    public AdvertiserReplyDTO() {
        this.Responders = new ResponderDTO();
        this.Message = "";
    }

    public ResponderDTO getResponders() {
        return Responders;
    }

    public void setResponders(ResponderDTO Responders) {
        this.Responders = Responders;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
}
