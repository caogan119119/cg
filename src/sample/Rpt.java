package sample;

import java.math.BigDecimal;

public class Rpt {
    private String bucket;
    private String supplierName;

    public Rpt(String bucket, String supplierName, String workShop, BigDecimal baseLine, BigDecimal rou, BigDecimal resourceQty, BigDecimal capQty) {
        this.bucket = bucket;
        this.supplierName = supplierName;
        this.workShop = workShop;
        this.baseLine = baseLine;
        this.rou = rou;
        this.resourceQty = resourceQty;
        this.capQty = capQty;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    private String workShop;
    private BigDecimal baseLine;
    private BigDecimal rou;
    private BigDecimal resourceQty;
    private BigDecimal capQty;
    private BigDecimal result;
    public Rpt() {

    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getWorkShop() {
        return workShop;
    }

    public void setWorkShop(String workShop) {
        this.workShop = workShop;
    }

    public BigDecimal getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(BigDecimal baseLine) {
        this.baseLine = baseLine;
    }

    public BigDecimal getRou() {
        return rou;
    }

    public void setRou(BigDecimal rou) {
        this.rou = rou;
    }

    public BigDecimal getResourceQty() {
        return resourceQty;
    }

    public void setResourceQty(BigDecimal resourceQty) {
        this.resourceQty = resourceQty;
    }

    public BigDecimal getCapQty() {
        return capQty;
    }

    public void setCapQty(BigDecimal capQty) {
        this.capQty = capQty;
    }

    public String grp(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.bucket);
        return sb.toString();
    }
}
