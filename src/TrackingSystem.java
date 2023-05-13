import java.util.ArrayList;
import java.util.List;

public class TrackingSystem {

    private List<Package> pk;
    private int nPk;

    public TrackingSystem(){
        pk = new ArrayList<>();
        nPk = 0;
    }

    public List<Package> getPackages() {
        return pk;
    }

    public int getnPackage() {
        return nPk;
    }

    public void addPackage(Package p){
        nPk += 1;
        pk.add(p);
    }

    public boolean removePackage(String trackingNumber){
        return searchByTrackingNumberSecuencial(trackingNumber);
    }

    public boolean searchByTrackingNumberSecuencial(String trackingNumber){
        for(int i = 0; i < pk.size(); i++){
            if(pk.get(i).getTrackingNumber().equals(trackingNumber)){
                pk.remove(i);
                return true;
            }
        }
        return false;
    }

    public Package searchByRecipientAddress(String street, String city, String state, String zipCode){
        for(int i = 0; i < pk.size(); i++){
            if(pk.get(i).getRecipientAddress().toString().equals(new Address(street, city, state, zipCode).toString())){
                return pk.get(i);
            }
        }
        return null;
    }

    public Package searchByTrackingNumberBinary(String trackingNumber){
        int res = -1;
        int left = 0;
        int right = pk.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (pk.get(mid).getTrackingNumber().equals(trackingNumber)) {
                res = mid;
                return pk.get(res);
            } else if (pk.get(mid).getTrackingNumber().compareTo(trackingNumber) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

}