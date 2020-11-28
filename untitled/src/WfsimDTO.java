import java.util.Objects;

public class WfsimDTO {
    private Integer providerId;
    private String gsmNetCode;
    private String simType;
    private String simNo;
    private String imsi;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getGsmNetCode() {
        return gsmNetCode;
    }

    public void setGsmNetCode(String gsmNetCode) {
        this.gsmNetCode = gsmNetCode;
    }

    public String getSimType() {
        return simType;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    public String getSimNo() {
        return simNo;
    }

    public void setSimNo(String simNo) {
        this.simNo = simNo;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WfsimDTO wfsimDTO = (WfsimDTO) o;
        return Objects.equals(providerId, wfsimDTO.providerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId);
    }
}
