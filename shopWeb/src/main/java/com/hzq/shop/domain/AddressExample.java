package com.hzq.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public AddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddrIdIsNull() {
            addCriterion("addr_id is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("addr_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(Long value) {
            addCriterion("addr_id =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(Long value) {
            addCriterion("addr_id <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(Long value) {
            addCriterion("addr_id >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("addr_id >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(Long value) {
            addCriterion("addr_id <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(Long value) {
            addCriterion("addr_id <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<Long> values) {
            addCriterion("addr_id in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<Long> values) {
            addCriterion("addr_id not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(Long value1, Long value2) {
            addCriterion("addr_id between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(Long value1, Long value2) {
            addCriterion("addr_id not between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdIsNull() {
            addCriterion("cust_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdIsNotNull() {
            addCriterion("cust_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdEqualTo(Long value) {
            addCriterion("cust_detail_id =", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdNotEqualTo(Long value) {
            addCriterion("cust_detail_id <>", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdGreaterThan(Long value) {
            addCriterion("cust_detail_id >", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_detail_id >=", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdLessThan(Long value) {
            addCriterion("cust_detail_id <", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_detail_id <=", value, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdIn(List<Long> values) {
            addCriterion("cust_detail_id in", values, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdNotIn(List<Long> values) {
            addCriterion("cust_detail_id not in", values, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdBetween(Long value1, Long value2) {
            addCriterion("cust_detail_id between", value1, value2, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andCustDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_detail_id not between", value1, value2, "custDetailId");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andDetailAddrIsNull() {
            addCriterion("detail_addr is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddrIsNotNull() {
            addCriterion("detail_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddrEqualTo(String value) {
            addCriterion("detail_addr =", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrNotEqualTo(String value) {
            addCriterion("detail_addr <>", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrGreaterThan(String value) {
            addCriterion("detail_addr >", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("detail_addr >=", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrLessThan(String value) {
            addCriterion("detail_addr <", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrLessThanOrEqualTo(String value) {
            addCriterion("detail_addr <=", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrLike(String value) {
            addCriterion("detail_addr like", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrNotLike(String value) {
            addCriterion("detail_addr not like", value, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrIn(List<String> values) {
            addCriterion("detail_addr in", values, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrNotIn(List<String> values) {
            addCriterion("detail_addr not in", values, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrBetween(String value1, String value2) {
            addCriterion("detail_addr between", value1, value2, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andDetailAddrNotBetween(String value1, String value2) {
            addCriterion("detail_addr not between", value1, value2, "detailAddr");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNull() {
            addCriterion("receipt_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNotNull() {
            addCriterion("receipt_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameEqualTo(String value) {
            addCriterion("receipt_name =", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotEqualTo(String value) {
            addCriterion("receipt_name <>", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThan(String value) {
            addCriterion("receipt_name >", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_name >=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThan(String value) {
            addCriterion("receipt_name <", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("receipt_name <=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLike(String value) {
            addCriterion("receipt_name like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotLike(String value) {
            addCriterion("receipt_name not like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIn(List<String> values) {
            addCriterion("receipt_name in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotIn(List<String> values) {
            addCriterion("receipt_name not in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameBetween(String value1, String value2) {
            addCriterion("receipt_name between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotBetween(String value1, String value2) {
            addCriterion("receipt_name not between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNull() {
            addCriterion("receipt_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIsNotNull() {
            addCriterion("receipt_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTelEqualTo(String value) {
            addCriterion("receipt_tel =", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotEqualTo(String value) {
            addCriterion("receipt_tel <>", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThan(String value) {
            addCriterion("receipt_tel >", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_tel >=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThan(String value) {
            addCriterion("receipt_tel <", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLessThanOrEqualTo(String value) {
            addCriterion("receipt_tel <=", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelLike(String value) {
            addCriterion("receipt_tel like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotLike(String value) {
            addCriterion("receipt_tel not like", value, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelIn(List<String> values) {
            addCriterion("receipt_tel in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotIn(List<String> values) {
            addCriterion("receipt_tel not in", values, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelBetween(String value1, String value2) {
            addCriterion("receipt_tel between", value1, value2, "receiptTel");
            return (Criteria) this;
        }

        public Criteria andReceiptTelNotBetween(String value1, String value2) {
            addCriterion("receipt_tel not between", value1, value2, "receiptTel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table address
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 27 23:01:23 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table address
     *
     * @mbggenerated Tue Sep 27 23:01:23 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}