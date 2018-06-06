package com.axtech.xiaomeiedit.xiaomeiedit.activity.bean;

import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;

import java.io.Serializable;
import java.util.List;


public class WareBean extends BaseBean implements Serializable {

    private List<RowsBean> rows;

    public List<RowsBean> getRows() {
        return rows;
    }

    public String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean implements Serializable {

        private float depositPrice;
        private boolean hasStorage;
        private String imgPath;
        private float rentPrice;
        private String scientificName;
        private String storageId;
        private String storageName;
        private String storeId;
        private String storeName;
        private String viewTimes;
        private String weight;

        public float getDepositPrice() {
            return depositPrice;
        }

        public void setDepositPrice(float depositPrice) {
            this.depositPrice = depositPrice;
        }

        public boolean isHasStorage() {
            return hasStorage;
        }

        public void setHasStorage(boolean hasStorage) {
            this.hasStorage = hasStorage;
        }

        public String getImgPath() {
            return imgPath;
        }

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        public float getRentPrice() {
            return rentPrice;
        }

        public void setRentPrice(float rentPrice) {
            this.rentPrice = rentPrice;
        }

        public String getScientificName() {
            return scientificName;
        }

        public void setScientificName(String scientificName) {
            this.scientificName = scientificName;
        }

        public String getStorageId() {
            return storageId;
        }

        public void setStorageId(String storageId) {
            this.storageId = storageId;
        }

        public String getStorageName() {
            return storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }

        public String getStoreId() {
            return storeId;
        }

        public void setStoreId(String storeId) {
            this.storeId = storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public String getViewTimes() {
            return viewTimes;
        }

        public void setViewTimes(String viewTimes) {
            this.viewTimes = viewTimes;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }
}
