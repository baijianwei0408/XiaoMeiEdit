package com.axtech.xiaomeiedit.xiaomeiedit.activity.bean;

import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;

import java.util.List;

public class LoginBean extends BaseBean {

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {

        private RealNameBean realName;
        private MetadataBean metadata;
        private CouponBean coupon;
        private LeaseCounterBean leaseCounter;
        private AccountCounterBean accountCounter;
        private UserBean user;
        private String token;
        private List<ChooseMerchantBean> chooseMerchant;

        public List<ChooseMerchantBean> getChooseMerchant() {
            return chooseMerchant;
        }

        public void setChooseMerchant(List<ChooseMerchantBean> chooseMerchant) {
            this.chooseMerchant = chooseMerchant;
        }

        public static class ChooseMerchantBean {

            private String name;
            private String id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public RealNameBean getRealName() {
            return realName;
        }

        public void setRealName(RealNameBean realName) {
            this.realName = realName;
        }

        public MetadataBean getMetadata() {
            return metadata;
        }

        public void setMetadata(MetadataBean metadata) {
            this.metadata = metadata;
        }

        public CouponBean getCoupon() {
            return coupon;
        }

        public void setCoupon(CouponBean coupon) {
            this.coupon = coupon;
        }

        public LeaseCounterBean getLeaseCounter() {
            return leaseCounter;
        }

        public void setLeaseCounter(LeaseCounterBean leaseCounter) {
            this.leaseCounter = leaseCounter;
        }

        public AccountCounterBean getAccountCounter() {
            return accountCounter;
        }

        public void setAccountCounter(AccountCounterBean accountCounter) {
            this.accountCounter = accountCounter;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class ChooseMerchant {
            private String name;
            private String id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public static class RealNameBean {

            private String realName;
            private String number;

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }
        }

        public static class MetadataBean {

            private EnumsBean enums;
            private List<MetalBean> metal;
            private List<CraftBean> craft;
            private List<CategoryBean> category;
            private List<GemBean> gem;

            public EnumsBean getEnums() {
                return enums;
            }

            public void setEnums(EnumsBean enums) {
                this.enums = enums;
            }

            public List<MetalBean> getMetal() {
                return metal;
            }

            public void setMetal(List<MetalBean> metal) {
                this.metal = metal;
            }

            public List<CraftBean> getCraft() {
                return craft;
            }

            public void setCraft(List<CraftBean> craft) {
                this.craft = craft;
            }

            public List<CategoryBean> getCategory() {
                return category;
            }

            public void setCategory(List<CategoryBean> category) {
                this.category = category;
            }

            public List<GemBean> getGem() {
                return gem;
            }

            public void setGem(List<GemBean> gem) {
                this.gem = gem;
            }

            public static class EnumsBean {
                private List<ShipperBean> shipper;
                private List<CostPriceAlgorithmBean> costPriceAlgorithm;
                private List<AuditResultBean> auditResult;
                private List<DirBean> dir;
                private List<CouponStatusBean> couponStatus;
                private List<LotteryStatusBean> lotteryStatus;
                private List<ImageTypeBean> imageType;
                private List<EthnicBean> ethnic;
                private List<ReceiptTypeBean> receiptType;
                private List<AccountTypeBean> accountType;
                private List<WithdrawRecordTypeBean> withdrawRecordType;
                private List<VersionBean> version;
                private List<AuditRecordStatusBean> auditRecordStatus;
                private List<UserLogTypeBean> userLogType;
                private List<WarePropertyInputTypeBean> warePropertyInputType;
                private List<UserTokenTypeBean> userTokenType;
                private List<WithdrawRecordStatusBean> withdrawRecordStatus;
                private List<AccountBillTypeBean> accountBillType;
                private List<WeightUnitBean> weightUnit;
                private List<LeaseRefundStatusBean> leaseRefundStatus;
                private List<StatusCodeBean> statusCode;
                private List<StockRejectBillStatusBean> stockRejectBillStatus;
                private List<UserStatusBean> userStatus;
                private List<GenderBean> gender;
                private List<ShippingTypeBean> shippingType;
                private List<SKUTypeBean> sKUType;
                private List<AuditTypeBean> auditType;
                private List<AccountStatusBean> accountStatus;
                private List<ShippingStatusBean> shippingStatus;
                private List<LogicTypeBean> logicType;
                private List<LeaseRecordStatusBean> leaseRecordStatus;
                private List<CouponTypeBean> couponType;
                private List<InventoryItemStatusBean> inventoryItemStatus;
                private List<ClientBean> client;
                private List<InventoryBillStatusBean> inventoryBillStatus;
                private List<LeaseStorageStatusBean> leaseStorageStatus;
                private List<GoodsBillTypeBean> goodsBillType;
                private List<AllocateBillStatusBean> allocateBillStatus;
                private List<StoreTypeBean> storeType;
                private List<CalendarTypeBean> calendarType;
                private List<StockTypeBean> stockType;
                private List<WarePropertyTypeBean> warePropertyType;
                private List<PhysicalGoldBillStatusBean> physicalGoldBillStatus;
                private List<PriceTypeBean> priceType;
                private List<EnvBean> env;
                private List<RetailPriceAlgorithmBean> retailPriceAlgorithm;
                private List<StockBillStatusBean> stockBillStatus;
                private List<?> promoBillType;
                private List<SmsBillTypeBean> smsBillType;
                private List<PayStatusBean> payStatus;
                private List<GatewayBean> gateway;
                private List<WareTypeBean> wareType;

                public List<ShipperBean> getShipper() {
                    return shipper;
                }

                public void setShipper(List<ShipperBean> shipper) {
                    this.shipper = shipper;
                }

                public List<CostPriceAlgorithmBean> getCostPriceAlgorithm() {
                    return costPriceAlgorithm;
                }

                public void setCostPriceAlgorithm(List<CostPriceAlgorithmBean> costPriceAlgorithm) {
                    this.costPriceAlgorithm = costPriceAlgorithm;
                }

                public List<AuditResultBean> getAuditResult() {
                    return auditResult;
                }

                public void setAuditResult(List<AuditResultBean> auditResult) {
                    this.auditResult = auditResult;
                }

                public List<DirBean> getDir() {
                    return dir;
                }

                public void setDir(List<DirBean> dir) {
                    this.dir = dir;
                }

                public List<CouponStatusBean> getCouponStatus() {
                    return couponStatus;
                }

                public void setCouponStatus(List<CouponStatusBean> couponStatus) {
                    this.couponStatus = couponStatus;
                }

                public List<LotteryStatusBean> getLotteryStatus() {
                    return lotteryStatus;
                }

                public void setLotteryStatus(List<LotteryStatusBean> lotteryStatus) {
                    this.lotteryStatus = lotteryStatus;
                }

                public List<ImageTypeBean> getImageType() {
                    return imageType;
                }

                public void setImageType(List<ImageTypeBean> imageType) {
                    this.imageType = imageType;
                }

                public List<EthnicBean> getEthnic() {
                    return ethnic;
                }

                public void setEthnic(List<EthnicBean> ethnic) {
                    this.ethnic = ethnic;
                }

                public List<ReceiptTypeBean> getReceiptType() {
                    return receiptType;
                }

                public void setReceiptType(List<ReceiptTypeBean> receiptType) {
                    this.receiptType = receiptType;
                }

                public List<AccountTypeBean> getAccountType() {
                    return accountType;
                }

                public void setAccountType(List<AccountTypeBean> accountType) {
                    this.accountType = accountType;
                }

                public List<WithdrawRecordTypeBean> getWithdrawRecordType() {
                    return withdrawRecordType;
                }

                public void setWithdrawRecordType(List<WithdrawRecordTypeBean> withdrawRecordType) {
                    this.withdrawRecordType = withdrawRecordType;
                }

                public List<VersionBean> getVersion() {
                    return version;
                }

                public void setVersion(List<VersionBean> version) {
                    this.version = version;
                }

                public List<AuditRecordStatusBean> getAuditRecordStatus() {
                    return auditRecordStatus;
                }

                public void setAuditRecordStatus(List<AuditRecordStatusBean> auditRecordStatus) {
                    this.auditRecordStatus = auditRecordStatus;
                }

                public List<UserLogTypeBean> getUserLogType() {
                    return userLogType;
                }

                public void setUserLogType(List<UserLogTypeBean> userLogType) {
                    this.userLogType = userLogType;
                }

                public List<WarePropertyInputTypeBean> getWarePropertyInputType() {
                    return warePropertyInputType;
                }

                public void setWarePropertyInputType(List<WarePropertyInputTypeBean> warePropertyInputType) {
                    this.warePropertyInputType = warePropertyInputType;
                }

                public List<UserTokenTypeBean> getUserTokenType() {
                    return userTokenType;
                }

                public void setUserTokenType(List<UserTokenTypeBean> userTokenType) {
                    this.userTokenType = userTokenType;
                }

                public List<WithdrawRecordStatusBean> getWithdrawRecordStatus() {
                    return withdrawRecordStatus;
                }

                public void setWithdrawRecordStatus(List<WithdrawRecordStatusBean> withdrawRecordStatus) {
                    this.withdrawRecordStatus = withdrawRecordStatus;
                }

                public List<AccountBillTypeBean> getAccountBillType() {
                    return accountBillType;
                }

                public void setAccountBillType(List<AccountBillTypeBean> accountBillType) {
                    this.accountBillType = accountBillType;
                }

                public List<WeightUnitBean> getWeightUnit() {
                    return weightUnit;
                }

                public void setWeightUnit(List<WeightUnitBean> weightUnit) {
                    this.weightUnit = weightUnit;
                }

                public List<LeaseRefundStatusBean> getLeaseRefundStatus() {
                    return leaseRefundStatus;
                }

                public void setLeaseRefundStatus(List<LeaseRefundStatusBean> leaseRefundStatus) {
                    this.leaseRefundStatus = leaseRefundStatus;
                }

                public List<StatusCodeBean> getStatusCode() {
                    return statusCode;
                }

                public void setStatusCode(List<StatusCodeBean> statusCode) {
                    this.statusCode = statusCode;
                }

                public List<StockRejectBillStatusBean> getStockRejectBillStatus() {
                    return stockRejectBillStatus;
                }

                public void setStockRejectBillStatus(List<StockRejectBillStatusBean> stockRejectBillStatus) {
                    this.stockRejectBillStatus = stockRejectBillStatus;
                }

                public List<UserStatusBean> getUserStatus() {
                    return userStatus;
                }

                public void setUserStatus(List<UserStatusBean> userStatus) {
                    this.userStatus = userStatus;
                }

                public List<GenderBean> getGender() {
                    return gender;
                }

                public void setGender(List<GenderBean> gender) {
                    this.gender = gender;
                }

                public List<ShippingTypeBean> getShippingType() {
                    return shippingType;
                }

                public void setShippingType(List<ShippingTypeBean> shippingType) {
                    this.shippingType = shippingType;
                }

                public List<SKUTypeBean> getSKUType() {
                    return sKUType;
                }

                public void setSKUType(List<SKUTypeBean> sKUType) {
                    this.sKUType = sKUType;
                }

                public List<AuditTypeBean> getAuditType() {
                    return auditType;
                }

                public void setAuditType(List<AuditTypeBean> auditType) {
                    this.auditType = auditType;
                }

                public List<AccountStatusBean> getAccountStatus() {
                    return accountStatus;
                }

                public void setAccountStatus(List<AccountStatusBean> accountStatus) {
                    this.accountStatus = accountStatus;
                }

                public List<ShippingStatusBean> getShippingStatus() {
                    return shippingStatus;
                }

                public void setShippingStatus(List<ShippingStatusBean> shippingStatus) {
                    this.shippingStatus = shippingStatus;
                }

                public List<LogicTypeBean> getLogicType() {
                    return logicType;
                }

                public void setLogicType(List<LogicTypeBean> logicType) {
                    this.logicType = logicType;
                }

                public List<LeaseRecordStatusBean> getLeaseRecordStatus() {
                    return leaseRecordStatus;
                }

                public void setLeaseRecordStatus(List<LeaseRecordStatusBean> leaseRecordStatus) {
                    this.leaseRecordStatus = leaseRecordStatus;
                }

                public List<CouponTypeBean> getCouponType() {
                    return couponType;
                }

                public void setCouponType(List<CouponTypeBean> couponType) {
                    this.couponType = couponType;
                }

                public List<InventoryItemStatusBean> getInventoryItemStatus() {
                    return inventoryItemStatus;
                }

                public void setInventoryItemStatus(List<InventoryItemStatusBean> inventoryItemStatus) {
                    this.inventoryItemStatus = inventoryItemStatus;
                }

                public List<ClientBean> getClient() {
                    return client;
                }

                public void setClient(List<ClientBean> client) {
                    this.client = client;
                }

                public List<InventoryBillStatusBean> getInventoryBillStatus() {
                    return inventoryBillStatus;
                }

                public void setInventoryBillStatus(List<InventoryBillStatusBean> inventoryBillStatus) {
                    this.inventoryBillStatus = inventoryBillStatus;
                }

                public List<LeaseStorageStatusBean> getLeaseStorageStatus() {
                    return leaseStorageStatus;
                }

                public void setLeaseStorageStatus(List<LeaseStorageStatusBean> leaseStorageStatus) {
                    this.leaseStorageStatus = leaseStorageStatus;
                }

                public List<GoodsBillTypeBean> getGoodsBillType() {
                    return goodsBillType;
                }

                public void setGoodsBillType(List<GoodsBillTypeBean> goodsBillType) {
                    this.goodsBillType = goodsBillType;
                }

                public List<AllocateBillStatusBean> getAllocateBillStatus() {
                    return allocateBillStatus;
                }

                public void setAllocateBillStatus(List<AllocateBillStatusBean> allocateBillStatus) {
                    this.allocateBillStatus = allocateBillStatus;
                }

                public List<StoreTypeBean> getStoreType() {
                    return storeType;
                }

                public void setStoreType(List<StoreTypeBean> storeType) {
                    this.storeType = storeType;
                }

                public List<CalendarTypeBean> getCalendarType() {
                    return calendarType;
                }

                public void setCalendarType(List<CalendarTypeBean> calendarType) {
                    this.calendarType = calendarType;
                }

                public List<StockTypeBean> getStockType() {
                    return stockType;
                }

                public void setStockType(List<StockTypeBean> stockType) {
                    this.stockType = stockType;
                }

                public List<WarePropertyTypeBean> getWarePropertyType() {
                    return warePropertyType;
                }

                public void setWarePropertyType(List<WarePropertyTypeBean> warePropertyType) {
                    this.warePropertyType = warePropertyType;
                }

                public List<PhysicalGoldBillStatusBean> getPhysicalGoldBillStatus() {
                    return physicalGoldBillStatus;
                }

                public void setPhysicalGoldBillStatus(List<PhysicalGoldBillStatusBean> physicalGoldBillStatus) {
                    this.physicalGoldBillStatus = physicalGoldBillStatus;
                }

                public List<PriceTypeBean> getPriceType() {
                    return priceType;
                }

                public void setPriceType(List<PriceTypeBean> priceType) {
                    this.priceType = priceType;
                }

                public List<EnvBean> getEnv() {
                    return env;
                }

                public void setEnv(List<EnvBean> env) {
                    this.env = env;
                }

                public List<RetailPriceAlgorithmBean> getRetailPriceAlgorithm() {
                    return retailPriceAlgorithm;
                }

                public void setRetailPriceAlgorithm(List<RetailPriceAlgorithmBean> retailPriceAlgorithm) {
                    this.retailPriceAlgorithm = retailPriceAlgorithm;
                }

                public List<StockBillStatusBean> getStockBillStatus() {
                    return stockBillStatus;
                }

                public void setStockBillStatus(List<StockBillStatusBean> stockBillStatus) {
                    this.stockBillStatus = stockBillStatus;
                }

                public List<?> getPromoBillType() {
                    return promoBillType;
                }

                public void setPromoBillType(List<?> promoBillType) {
                    this.promoBillType = promoBillType;
                }

                public List<SmsBillTypeBean> getSmsBillType() {
                    return smsBillType;
                }

                public void setSmsBillType(List<SmsBillTypeBean> smsBillType) {
                    this.smsBillType = smsBillType;
                }

                public List<PayStatusBean> getPayStatus() {
                    return payStatus;
                }

                public void setPayStatus(List<PayStatusBean> payStatus) {
                    this.payStatus = payStatus;
                }

                public List<GatewayBean> getGateway() {
                    return gateway;
                }

                public void setGateway(List<GatewayBean> gateway) {
                    this.gateway = gateway;
                }

                public List<WareTypeBean> getWareType() {
                    return wareType;
                }

                public void setWareType(List<WareTypeBean> wareType) {
                    this.wareType = wareType;
                }

                public static class ShipperBean {
                    /**
                     * name : 京东物流
                     * id : JD
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class CostPriceAlgorithmBean {
                    /**
                     * name : 手工输入
                     * id : INPUT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AuditResultBean {
                    /**
                     * name : 通过
                     * id : APPROVED
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class DirBean {
                    /**
                     * name : 升序
                     * id : ASC
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class CouponStatusBean {
                    /**
                     * name : 待使用
                     * id : ACTIVE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class LotteryStatusBean {
                    /**
                     * name : 活跃
                     * id : ACTIVE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ImageTypeBean {
                    /**
                     * name : 主图
                     * id : MAIN
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class EthnicBean {
                    /**
                     * name : 汉族
                     * id : HAN
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ReceiptTypeBean {
                    /**
                     * name : 普通销售
                     * id : RETAIL_NORMAL
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AccountTypeBean {
                    /**
                     * name : 钱包
                     * id : CASH_WALLET
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WithdrawRecordTypeBean {
                    /**
                     * name : 银行转账
                     * id : TRANSFER
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class VersionBean {
                    /**
                     * name : 标准版
                     * id : STANDARD
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AuditRecordStatusBean {
                    /**
                     * name : 待审批
                     * id : WAIT_AUDIT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class UserLogTypeBean {
                    /**
                     * name : 设置登录密码
                     * id : SET_PWD
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WarePropertyInputTypeBean {
                    /**
                     * name : 文本框
                     * id : INPUT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class UserTokenTypeBean {
                    /**
                     * name : 密码
                     * id : PWD
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WithdrawRecordStatusBean {
                    /**
                     * name : 审核中
                     * id : WAIT_AUDIT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AccountBillTypeBean {
                    /**
                     * name : 充值
                     * id : RECHARGE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WeightUnitBean {
                    /**
                     * name : 克
                     * id : g
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class LeaseRefundStatusBean {
                    /**
                     * name : 无退款
                     * id : NO_REFUND
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class StatusCodeBean {
                    /**
                     * name : 请求参数错误
                     * id : REQUEST_ERROR
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class StockRejectBillStatusBean {
                    /**
                     * name : 待提交
                     * id : TO_SUBMIT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class UserStatusBean {
                    /**
                     * name : 正常
                     * id : OK
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class GenderBean {
                    /**
                     * name : 男性
                     * id : MALE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ShippingTypeBean {
                    /**
                     * name : 快递发货
                     * id : LOGISTICS
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class SKUTypeBean {
                    /**
                     * name : 单款单件
                     * id : SINGLE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AuditTypeBean {
                    /**
                     * name : 采购入库单
                     * id : GOODS_STOCK
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AccountStatusBean {
                    /**
                     * name : 活跃
                     * id : ACTIVE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ShippingStatusBean {
                    /**
                     * name : 已揽件
                     * id : PICKUPED
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class LogicTypeBean {
                    /**
                     * name : 且
                     * id : AND
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class LeaseRecordStatusBean {
                    /**
                     * name : 待付款
                     * id : WAIT_PAY
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class CouponTypeBean {
                    /**
                     * name : 现金券
                     * id : CASH_TO_LEASE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class InventoryItemStatusBean {
                    /**
                     * name : 等待盘点
                     * id : PENDING
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ClientBean {
                    /**
                     * name : 苹果
                     * id : IOS
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class InventoryBillStatusBean {
                    /**
                     * name : 待提交
                     * id : TO_SUBMIT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class LeaseStorageStatusBean {
                    /**
                     * name : 待上架
                     * id : PENDING
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class GoodsBillTypeBean {
                    /**
                     * name : 采购入库
                     * id : STOCK_IN
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class AllocateBillStatusBean {
                    /**
                     * name : 待发货
                     * id : TO_ALLOCATE_OUT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class StoreTypeBean {
                    /**
                     * name : 管理门店
                     * id : MANAGE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class CalendarTypeBean {
                    /**
                     * name : 公历
                     * id : SOLAR
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class StockTypeBean {
                    /**
                     * name : 买入
                     * id : BUY
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WarePropertyTypeBean {
                    /**
                     * name : 材质参数
                     * id : METAL
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class PhysicalGoldBillStatusBean {
                    /**
                     * name : 待付款
                     * id : WAIT_PAY
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class PriceTypeBean {
                    /**
                     * name : 计重
                     * id : WEIGHTED
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class EnvBean {
                    /**
                     * name : 开发环境
                     * id : DEV
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class RetailPriceAlgorithmBean {
                    /**
                     * name : 今日金价
                     * id : TODAY_METAL_PRICE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class StockBillStatusBean {
                    /**
                     * name : 待提交
                     * id : TO_SUBMIT
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class SmsBillTypeBean {
                    /**
                     * name : 验证码短信
                     * id : RAND
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class PayStatusBean {
                    /**
                     * name : 待审核
                     * id : TO_VERIFY
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class GatewayBean {
                    /**
                     * name : 微信APP
                     * id : WEIXIN_APP
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class WareTypeBean {
                    /**
                     * name : 素金
                     * id : PURE
                     */

                    private String name;
                    private String id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }

            public static class MetalBean {
                /**
                 * code :
                 * name : 铂金
                 * id : 59f45f835a2f4249bf7f7dfbcfab7513
                 * labelName : 铂Pt950
                 * props : [{"code":"10","preValues":"选项1,选项2,选项3,99%","name":"铂金参数","inputType":"INPUT","id":"74edde584d1141599a369758e27f09ae","required":false,"enabled":true},{"code":"22151","preValues":"哈哈","name":"第二个参数1121","inputType":"RADIO","id":"f9afc904b8a3409ab7255b7374f4e2e5","required":false,"enabled":true}]
                 */

                private String code;
                private String name;
                private String id;
                private String labelName;
                private List<PropsBean> props;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabelName() {
                    return labelName;
                }

                public void setLabelName(String labelName) {
                    this.labelName = labelName;
                }

                public List<PropsBean> getProps() {
                    return props;
                }

                public void setProps(List<PropsBean> props) {
                    this.props = props;
                }

                public static class PropsBean {
                    /**
                     * code : 10
                     * preValues : 选项1,选项2,选项3,99%
                     * name : 铂金参数
                     * inputType : INPUT
                     * id : 74edde584d1141599a369758e27f09ae
                     * required : false
                     * enabled : true
                     */

                    private String code;
                    private String preValues;
                    private String name;
                    private String inputType;
                    private String id;
                    private boolean required;
                    private boolean enabled;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getPreValues() {
                        return preValues;
                    }

                    public void setPreValues(String preValues) {
                        this.preValues = preValues;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getInputType() {
                        return inputType;
                    }

                    public void setInputType(String inputType) {
                        this.inputType = inputType;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }
                }
            }

            public static class CraftBean {
                /**
                 * name : 烤漆
                 * id : 79c31be75cb54f94ad7177c330f26c42
                 * code : 0
                 * labelName :
                 */

                private String name;
                private String id;
                private String code;
                private String labelName;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getLabelName() {
                    return labelName;
                }

                public void setLabelName(String labelName) {
                    this.labelName = labelName;
                }
            }

            public static class CategoryBean {
                /**
                 * code : 0011
                 * name : 戒指
                 * id : b1e1f99d2c594bdcb49ad9b4bafeda3a
                 * labelName :
                 * props : [{"code":"1","preValues":"11号,11.5号,12号","name":"指圈","inputType":"CHECKBOX","id":"7c112b28d9534e92b99dbf9dba49785d","required":true,"enabled":true},{"code":"111","preValues":"aaa,bbb,ccc","name":"2222","inputType":"INPUT","id":"dde258923cc44a54bf7eb9ee1e4865dd","required":false,"enabled":true},{"code":"1231","preValues":"1132312","name":"1131","inputType":"INPUT","id":"50cc75f065264b64a1a941fff28e6d76","required":true,"enabled":true},{"code":"123123","preValues":"123123","name":"123123","inputType":"INPUT","id":"63dca953379347059aeeaaf9c7b04542","required":true,"enabled":true},{"code":"222","preValues":"","name":"戒指品类测试","inputType":"INPUT","id":"bc160193dec845b0aafdc88815c9c859","required":false,"enabled":true},{"code":"4141241","preValues":"男款,女款","name":"款式","inputType":"RADIO","id":"b753434430bc466fbfbf4b7df1328062","required":true,"enabled":true},{"code":"5555666","preValues":"5555666","name":"5555666","inputType":"INPUT","id":"3f505bbc9742432fa6c720d2ba111f0e","required":true,"enabled":true},{"code":"6666666","preValues":"66666666","name":"6666666","inputType":"INPUT","id":"2a14512352c24237ac46654071f0fc70","required":true,"enabled":true}]
                 */

                private String code;
                private String name;
                private String id;
                private String labelName;
                private List<PropsBeanX> props;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabelName() {
                    return labelName;
                }

                public void setLabelName(String labelName) {
                    this.labelName = labelName;
                }

                public List<PropsBeanX> getProps() {
                    return props;
                }

                public void setProps(List<PropsBeanX> props) {
                    this.props = props;
                }

                public static class PropsBeanX {
                    /**
                     * code : 1
                     * preValues : 11号,11.5号,12号
                     * name : 指圈
                     * inputType : CHECKBOX
                     * id : 7c112b28d9534e92b99dbf9dba49785d
                     * required : true
                     * enabled : true
                     */

                    private String code;
                    private String preValues;
                    private String name;
                    private String inputType;
                    private String id;
                    private boolean required;
                    private boolean enabled;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getPreValues() {
                        return preValues;
                    }

                    public void setPreValues(String preValues) {
                        this.preValues = preValues;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getInputType() {
                        return inputType;
                    }

                    public void setInputType(String inputType) {
                        this.inputType = inputType;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }
                }
            }

            public static class GemBean {
                /**
                 * code :
                 * name : 红宝石
                 * id : 72b231dd5b3b425c82ae0e93e8dc8bd7
                 * labelName :
                 * props : [{"code":"1","preValues":"1,2,2,","name":"1","inputType":"INPUT","id":"19fa5bb4efc04ca48d9cde77af080e99","required":false,"enabled":true},{"code":"xxxxx","preValues":"xxxx","name":"xxxx","inputType":"INPUT","id":"303b4f0e2c4a4affab30b488bf20e3c2","required":false,"enabled":true}]
                 */

                private String code;
                private String name;
                private String id;
                private String labelName;
                private List<PropsBeanXX> props;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLabelName() {
                    return labelName;
                }

                public void setLabelName(String labelName) {
                    this.labelName = labelName;
                }

                public List<PropsBeanXX> getProps() {
                    return props;
                }

                public void setProps(List<PropsBeanXX> props) {
                    this.props = props;
                }

                public static class PropsBeanXX {
                    /**
                     * code : 1
                     * preValues : 1,2,2,
                     * name : 1
                     * inputType : INPUT
                     * id : 19fa5bb4efc04ca48d9cde77af080e99
                     * required : false
                     * enabled : true
                     */

                    private String code;
                    private String preValues;
                    private String name;
                    private String inputType;
                    private String id;
                    private boolean required;
                    private boolean enabled;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getPreValues() {
                        return preValues;
                    }

                    public void setPreValues(String preValues) {
                        this.preValues = preValues;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getInputType() {
                        return inputType;
                    }

                    public void setInputType(String inputType) {
                        this.inputType = inputType;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public boolean isRequired() {
                        return required;
                    }

                    public void setRequired(boolean required) {
                        this.required = required;
                    }

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }
                }
            }
        }

        public static class CouponBean {
            /**
             * cashAmount : 10
             * count : 6
             * drawable : true
             */

            private int cashAmount;
            private int count;
            private boolean drawable;

            public int getCashAmount() {
                return cashAmount;
            }

            public void setCashAmount(int cashAmount) {
                this.cashAmount = cashAmount;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public boolean isDrawable() {
                return drawable;
            }

            public void setDrawable(boolean drawable) {
                this.drawable = drawable;
            }
        }

        public static class LeaseCounterBean {
            /**
             * backing : 3
             * leasing : 2
             * toAccept : 23
             * toPay : 0
             */

            private int backing;
            private int leasing;
            private int toAccept;
            private int toPay;

            public int getBacking() {
                return backing;
            }

            public void setBacking(int backing) {
                this.backing = backing;
            }

            public int getLeasing() {
                return leasing;
            }

            public void setLeasing(int leasing) {
                this.leasing = leasing;
            }

            public int getToAccept() {
                return toAccept;
            }

            public void setToAccept(int toAccept) {
                this.toAccept = toAccept;
            }

            public int getToPay() {
                return toPay;
            }

            public void setToPay(int toPay) {
                this.toPay = toPay;
            }
        }

        public static class AccountCounterBean {
            /**
             * mutableGold : 417417597
             * wallet : 4.9973766756E8
             */

            private int mutableGold;
            private double wallet;

            public int getMutableGold() {
                return mutableGold;
            }

            public void setMutableGold(int mutableGold) {
                this.mutableGold = mutableGold;
            }

            public double getWallet() {
                return wallet;
            }

            public void setWallet(double wallet) {
                this.wallet = wallet;
            }
        }

        public static class UserBean {
            /**
             * weixin : false
             * inviteCode : 6D8364A6
             * avatarPath : avatar/20180524/ba820b134bf048458708f5a0e2ac3d54
             * selectShop : 0273b3ce857140d58429e49a357aac8d
             * telephone : 17608005987
             * id : 0273b3ce857140d58429e49a357aac8d
             * weixinBinded : false
             */

            private boolean weixin;
            private String inviteCode;
            private String avatarPath;
            private String selectShop;
            private String telephone;
            private String id;
            private boolean weixinBinded;

            public boolean isWeixin() {
                return weixin;
            }

            public void setWeixin(boolean weixin) {
                this.weixin = weixin;
            }

            public String getInviteCode() {
                return inviteCode;
            }

            public void setInviteCode(String inviteCode) {
                this.inviteCode = inviteCode;
            }

            public String getAvatarPath() {
                return avatarPath;
            }

            public void setAvatarPath(String avatarPath) {
                this.avatarPath = avatarPath;
            }

            public String getSelectShop() {
                return selectShop;
            }

            public void setSelectShop(String selectShop) {
                this.selectShop = selectShop;
            }

            public String getTelephone() {
                return telephone;
            }

            public void setTelephone(String telephone) {
                this.telephone = telephone;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public boolean isWeixinBinded() {
                return weixinBinded;
            }

            public void setWeixinBinded(boolean weixinBinded) {
                this.weixinBinded = weixinBinded;
            }
        }
    }
}
