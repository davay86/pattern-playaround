public class AdapterObject implements ClientAwareInterface{
    ClientUnawareObject clientUnawareObject;
    public void clientAwareMethod() {
        clientUnawareObject = new ClientUnawareObject();
        clientUnawareObject.clientUnawareThisIsBeingCalled();
    }
}
