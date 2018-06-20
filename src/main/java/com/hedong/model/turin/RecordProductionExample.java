package com.hedong.model.turin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordProductionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record_production
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record_production
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record_production
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public RecordProductionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
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
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record_production
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record_production
     *
     * @mbggenerated
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityIsNull() {
            addCriterion("honey_quantity is null");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityIsNotNull() {
            addCriterion("honey_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityEqualTo(BigDecimal value) {
            addCriterion("honey_quantity =", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityNotEqualTo(BigDecimal value) {
            addCriterion("honey_quantity <>", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityGreaterThan(BigDecimal value) {
            addCriterion("honey_quantity >", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("honey_quantity >=", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityLessThan(BigDecimal value) {
            addCriterion("honey_quantity <", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("honey_quantity <=", value, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityIn(List<BigDecimal> values) {
            addCriterion("honey_quantity in", values, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityNotIn(List<BigDecimal> values) {
            addCriterion("honey_quantity not in", values, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("honey_quantity between", value1, value2, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneyQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("honey_quantity not between", value1, value2, "honeyQuantity");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusIsNull() {
            addCriterion("honey_surplus is null");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusIsNotNull() {
            addCriterion("honey_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusEqualTo(BigDecimal value) {
            addCriterion("honey_surplus =", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusNotEqualTo(BigDecimal value) {
            addCriterion("honey_surplus <>", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusGreaterThan(BigDecimal value) {
            addCriterion("honey_surplus >", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("honey_surplus >=", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusLessThan(BigDecimal value) {
            addCriterion("honey_surplus <", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("honey_surplus <=", value, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusIn(List<BigDecimal> values) {
            addCriterion("honey_surplus in", values, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusNotIn(List<BigDecimal> values) {
            addCriterion("honey_surplus not in", values, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("honey_surplus between", value1, value2, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("honey_surplus not between", value1, value2, "honeySurplus");
            return (Criteria) this;
        }

        public Criteria andHoneySourceIsNull() {
            addCriterion("honey_source is null");
            return (Criteria) this;
        }

        public Criteria andHoneySourceIsNotNull() {
            addCriterion("honey_source is not null");
            return (Criteria) this;
        }

        public Criteria andHoneySourceEqualTo(Byte value) {
            addCriterion("honey_source =", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceNotEqualTo(Byte value) {
            addCriterion("honey_source <>", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceGreaterThan(Byte value) {
            addCriterion("honey_source >", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("honey_source >=", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceLessThan(Byte value) {
            addCriterion("honey_source <", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceLessThanOrEqualTo(Byte value) {
            addCriterion("honey_source <=", value, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceIn(List<Byte> values) {
            addCriterion("honey_source in", values, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceNotIn(List<Byte> values) {
            addCriterion("honey_source not in", values, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceBetween(Byte value1, Byte value2) {
            addCriterion("honey_source between", value1, value2, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneySourceNotBetween(Byte value1, Byte value2) {
            addCriterion("honey_source not between", value1, value2, "honeySource");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusIsNull() {
            addCriterion("honey_status is null");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusIsNotNull() {
            addCriterion("honey_status is not null");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusEqualTo(Byte value) {
            addCriterion("honey_status =", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusNotEqualTo(Byte value) {
            addCriterion("honey_status <>", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusGreaterThan(Byte value) {
            addCriterion("honey_status >", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("honey_status >=", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusLessThan(Byte value) {
            addCriterion("honey_status <", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("honey_status <=", value, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusIn(List<Byte> values) {
            addCriterion("honey_status in", values, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusNotIn(List<Byte> values) {
            addCriterion("honey_status not in", values, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusBetween(Byte value1, Byte value2) {
            addCriterion("honey_status between", value1, value2, "honeyStatus");
            return (Criteria) this;
        }

        public Criteria andHoneyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("honey_status not between", value1, value2, "honeyStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record_production
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record_production
     *
     * @mbggenerated
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