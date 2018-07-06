package com.axtech.xiaomeiedit.xiaomeiedit.activity.bean;

import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WareDetailBean extends BaseBean implements Serializable {

    private String serial;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    private List<RowsBean> rows;

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean implements Serializable {

        private int favoriteCount;
        private LeaseBean lease;
        private ImageBean mainImage;
        private StorageViewBean storageView;
        private String storeServicePhone;
        private List<ImageBean> detailImages;
        private List<ImageBean> slideImages;

        public ImageBean getMainImage() {
            return mainImage;
        }

        public void setMainImage(ImageBean mainImage) {
            this.mainImage = mainImage;
        }

        public List<ImageBean> getDetailImages() {
            return detailImages;
        }

        public void setDetailImages(List<ImageBean> detailImages) {
            this.detailImages = detailImages;
        }


        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public LeaseBean getLease() {
            return lease;
        }

        public void setLease(LeaseBean lease) {
            this.lease = lease;
        }


        public StorageViewBean getStorageView() {
            return storageView;
        }

        public void setStorageView(StorageViewBean storageView) {
            this.storageView = storageView;
        }

        public String getStoreServicePhone() {
            return storeServicePhone;
        }

        public void setStoreServicePhone(String storeServicePhone) {
            this.storeServicePhone = storeServicePhone;
        }


        public List<ImageBean> getSlideImages() {
            return slideImages;
        }

        public void setSlideImages(List<ImageBean> slideImages) {
            this.slideImages = slideImages;
        }

        public static class LeaseBean implements Serializable {

            private long createTime;
            private int createYmd;
            private String creatorId;
            private String creatorName;
            private double depositPrice;
            private String id;
            private int imageCount;
            private int lockedStorage;
            private String merchantId;
            private String merchantName;
            private double rentPrice;
            private String statusX;
            private long updateTime;
            private String updaterId;
            private String updaterName;
            private int viewCount;

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getCreateYmd() {
                return createYmd;
            }

            public void setCreateYmd(int createYmd) {
                this.createYmd = createYmd;
            }

            public String getCreatorId() {
                return creatorId;
            }

            public void setCreatorId(String creatorId) {
                this.creatorId = creatorId;
            }

            public String getCreatorName() {
                return creatorName;
            }

            public void setCreatorName(String creatorName) {
                this.creatorName = creatorName;
            }

            public double getDepositPrice() {
                return depositPrice;
            }

            public void setDepositPrice(double depositPrice) {
                this.depositPrice = depositPrice;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getImageCount() {
                return imageCount;
            }

            public void setImageCount(int imageCount) {
                this.imageCount = imageCount;
            }

            public int getLockedStorage() {
                return lockedStorage;
            }

            public void setLockedStorage(int lockedStorage) {
                this.lockedStorage = lockedStorage;
            }

            public String getMerchantId() {
                return merchantId;
            }

            public void setMerchantId(String merchantId) {
                this.merchantId = merchantId;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public double getRentPrice() {
                return rentPrice;
            }

            public void setRentPrice(double rentPrice) {
                this.rentPrice = rentPrice;
            }

            public String getStatusX() {
                return statusX;
            }

            public void setStatusX(String statusX) {
                this.statusX = statusX;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public String getUpdaterId() {
                return updaterId;
            }

            public void setUpdaterId(String updaterId) {
                this.updaterId = updaterId;
            }

            public String getUpdaterName() {
                return updaterName;
            }

            public void setUpdaterName(String updaterName) {
                this.updaterName = updaterName;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }

        public static class ImageBean implements Serializable {

            private long createTime;
            private int createYmd;
            private String creatorId;
            private String creatorName;
            private String id;
            private String merchantId;
            private String merchantName;
            private String path;
            private String storageId;
            private String type;
            private long updateTime;

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getCreateYmd() {
                return createYmd;
            }

            public void setCreateYmd(int createYmd) {
                this.createYmd = createYmd;
            }

            public String getCreatorId() {
                return creatorId;
            }

            public void setCreatorId(String creatorId) {
                this.creatorId = creatorId;
            }

            public String getCreatorName() {
                return creatorName;
            }

            public void setCreatorName(String creatorName) {
                this.creatorName = creatorName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMerchantId() {
                return merchantId;
            }

            public void setMerchantId(String merchantId) {
                this.merchantId = merchantId;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getStorageId() {
                return storageId;
            }

            public void setStorageId(String storageId) {
                this.storageId = storageId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }
        }

        public static class StorageViewBean implements Serializable {

            private String merchantId;
            private String merchantName;
            private String scientificName;
            private StorageBean storage;
            private String storageName;
            private String storeId;
            private String storeName;
            private List<?> props;

            public String getMerchantId() {
                return merchantId;
            }

            public void setMerchantId(String merchantId) {
                this.merchantId = merchantId;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public String getScientificName() {
                return scientificName;
            }

            public void setScientificName(String scientificName) {
                this.scientificName = scientificName;
            }

            public StorageBean getStorage() {
                return storage;
            }

            public void setStorage(StorageBean storage) {
                this.storage = storage;
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

            public List<?> getProps() {
                return props;
            }

            public void setProps(List<?> props) {
                this.props = props;
            }

            public static class StorageBean implements Serializable {

                private int amount;
                private boolean bargainPrice;
                private String categoryId;
                private String categoryName;
                private String craftId;
                private long createTime;
                private int createYmd;
                private String creatorId;
                private String creatorName;
                private String gemId;
                private String id;
                private String lastBillId;
                private long lastBillTime;
                private String lastBillType;
                private String lastItemId;
                private boolean leaseAble;
                private int mainGemAmount;
                private String merchantId;
                private String merchantName;
                private String metalId;
                private String metalName;
                private String modelCode;
                private String moralName;
                private boolean onSale;
                private String priceType;
                private double processingCharges;
                private boolean qcPassed;
                private double regularPrice;
                private double retailPrice;
                private String retailPriceAlgorithm;
                private String serial;
                private String skuType;
                private String stockType;
                private String storeId;
                private String storeName;
                private long updateTime;
                private String vendorId;
                private String wareHouseId;
                private String wareHouseName;
                private String wareType;
                private double weight;
                private String weightDesc;
                private String weightUnit;

                public int getAmount() {
                    return amount;
                }

                public void setAmount(int amount) {
                    this.amount = amount;
                }

                public boolean isBargainPrice() {
                    return bargainPrice;
                }

                public void setBargainPrice(boolean bargainPrice) {
                    this.bargainPrice = bargainPrice;
                }

                public String getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(String categoryId) {
                    this.categoryId = categoryId;
                }

                public String getCategoryName() {
                    return categoryName;
                }

                public void setCategoryName(String categoryName) {
                    this.categoryName = categoryName;
                }

                public String getCraftId() {
                    return craftId;
                }

                public void setCraftId(String craftId) {
                    this.craftId = craftId;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public int getCreateYmd() {
                    return createYmd;
                }

                public void setCreateYmd(int createYmd) {
                    this.createYmd = createYmd;
                }

                public String getCreatorId() {
                    return creatorId;
                }

                public void setCreatorId(String creatorId) {
                    this.creatorId = creatorId;
                }

                public String getCreatorName() {
                    return creatorName;
                }

                public void setCreatorName(String creatorName) {
                    this.creatorName = creatorName;
                }

                public String getGemId() {
                    return gemId;
                }

                public void setGemId(String gemId) {
                    this.gemId = gemId;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLastBillId() {
                    return lastBillId;
                }

                public void setLastBillId(String lastBillId) {
                    this.lastBillId = lastBillId;
                }

                public long getLastBillTime() {
                    return lastBillTime;
                }

                public void setLastBillTime(long lastBillTime) {
                    this.lastBillTime = lastBillTime;
                }

                public String getLastBillType() {
                    return lastBillType;
                }

                public void setLastBillType(String lastBillType) {
                    this.lastBillType = lastBillType;
                }

                public String getLastItemId() {
                    return lastItemId;
                }

                public void setLastItemId(String lastItemId) {
                    this.lastItemId = lastItemId;
                }

                public boolean isLeaseAble() {
                    return leaseAble;
                }

                public void setLeaseAble(boolean leaseAble) {
                    this.leaseAble = leaseAble;
                }

                public int getMainGemAmount() {
                    return mainGemAmount;
                }

                public void setMainGemAmount(int mainGemAmount) {
                    this.mainGemAmount = mainGemAmount;
                }

                public String getMerchantId() {
                    return merchantId;
                }

                public void setMerchantId(String merchantId) {
                    this.merchantId = merchantId;
                }

                public String getMerchantName() {
                    return merchantName;
                }

                public void setMerchantName(String merchantName) {
                    this.merchantName = merchantName;
                }

                public String getMetalId() {
                    return metalId;
                }

                public void setMetalId(String metalId) {
                    this.metalId = metalId;
                }

                public String getMetalName() {
                    return metalName;
                }

                public void setMetalName(String metalName) {
                    this.metalName = metalName;
                }

                public String getModelCode() {
                    return modelCode;
                }

                public void setModelCode(String modelCode) {
                    this.modelCode = modelCode;
                }

                public String getMoralName() {
                    return moralName;
                }

                public void setMoralName(String moralName) {
                    this.moralName = moralName;
                }

                public boolean isOnSale() {
                    return onSale;
                }

                public void setOnSale(boolean onSale) {
                    this.onSale = onSale;
                }

                public String getPriceType() {
                    return priceType;
                }

                public void setPriceType(String priceType) {
                    this.priceType = priceType;
                }

                public double getProcessingCharges() {
                    return processingCharges;
                }

                public void setProcessingCharges(double processingCharges) {
                    this.processingCharges = processingCharges;
                }

                public boolean isQcPassed() {
                    return qcPassed;
                }

                public void setQcPassed(boolean qcPassed) {
                    this.qcPassed = qcPassed;
                }

                public double getRegularPrice() {
                    return regularPrice;
                }

                public void setRegularPrice(double regularPrice) {
                    this.regularPrice = regularPrice;
                }

                public double getRetailPrice() {
                    return retailPrice;
                }

                public void setRetailPrice(double retailPrice) {
                    this.retailPrice = retailPrice;
                }

                public String getRetailPriceAlgorithm() {
                    return retailPriceAlgorithm;
                }

                public void setRetailPriceAlgorithm(String retailPriceAlgorithm) {
                    this.retailPriceAlgorithm = retailPriceAlgorithm;
                }

                public String getSerial() {
                    return serial;
                }

                public void setSerial(String serial) {
                    this.serial = serial;
                }

                public String getSkuType() {
                    return skuType;
                }

                public void setSkuType(String skuType) {
                    this.skuType = skuType;
                }

                public String getStockType() {
                    return stockType;
                }

                public void setStockType(String stockType) {
                    this.stockType = stockType;
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

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public String getVendorId() {
                    return vendorId;
                }

                public void setVendorId(String vendorId) {
                    this.vendorId = vendorId;
                }

                public String getWareHouseId() {
                    return wareHouseId;
                }

                public void setWareHouseId(String wareHouseId) {
                    this.wareHouseId = wareHouseId;
                }

                public String getWareHouseName() {
                    return wareHouseName;
                }

                public void setWareHouseName(String wareHouseName) {
                    this.wareHouseName = wareHouseName;
                }

                public String getWareType() {
                    return wareType;
                }

                public void setWareType(String wareType) {
                    this.wareType = wareType;
                }

                public double getWeight() {
                    return weight;
                }

                public void setWeight(double weight) {
                    this.weight = weight;
                }

                public String getWeightDesc() {
                    return weightDesc;
                }

                public void setWeightDesc(String weightDesc) {
                    this.weightDesc = weightDesc;
                }

                public String getWeightUnit() {
                    return weightUnit;
                }

                public void setWeightUnit(String weightUnit) {
                    this.weightUnit = weightUnit;
                }
            }
        }

        public static class DetailImagesBean extends ImageBean implements Serializable {

            private long createTime;
            private int createYmd;
            private String creatorId;
            private String creatorName;
            private String id;
            private String merchantId;
            private String merchantName;
            private String path;
            private String storageId;
            private String type;
            private long updateTime;

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getCreateYmd() {
                return createYmd;
            }

            public void setCreateYmd(int createYmd) {
                this.createYmd = createYmd;
            }

            public String getCreatorId() {
                return creatorId;
            }

            public void setCreatorId(String creatorId) {
                this.creatorId = creatorId;
            }

            public String getCreatorName() {
                return creatorName;
            }

            public void setCreatorName(String creatorName) {
                this.creatorName = creatorName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMerchantId() {
                return merchantId;
            }

            public void setMerchantId(String merchantId) {
                this.merchantId = merchantId;
            }

            public String getMerchantName() {
                return merchantName;
            }

            public void setMerchantName(String merchantName) {
                this.merchantName = merchantName;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getStorageId() {
                return storageId;
            }

            public void setStorageId(String storageId) {
                this.storageId = storageId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }
        }
    }
}
