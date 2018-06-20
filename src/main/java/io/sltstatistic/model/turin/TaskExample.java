package io.sltstatistic.model.turin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
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
     * This method corresponds to the database table task
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
     * This method corresponds to the database table task
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
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
     * This class corresponds to the database table task
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

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsIsNull() {
            addCriterion("task_details is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsIsNotNull() {
            addCriterion("task_details is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsEqualTo(String value) {
            addCriterion("task_details =", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsNotEqualTo(String value) {
            addCriterion("task_details <>", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsGreaterThan(String value) {
            addCriterion("task_details >", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("task_details >=", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsLessThan(String value) {
            addCriterion("task_details <", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsLessThanOrEqualTo(String value) {
            addCriterion("task_details <=", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsLike(String value) {
            addCriterion("task_details like", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsNotLike(String value) {
            addCriterion("task_details not like", value, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsIn(List<String> values) {
            addCriterion("task_details in", values, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsNotIn(List<String> values) {
            addCriterion("task_details not in", values, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsBetween(String value1, String value2) {
            addCriterion("task_details between", value1, value2, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andTaskDetailsNotBetween(String value1, String value2) {
            addCriterion("task_details not between", value1, value2, "taskDetails");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumIsNull() {
            addCriterion("award_beenum is null");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumIsNotNull() {
            addCriterion("award_beenum is not null");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumEqualTo(Integer value) {
            addCriterion("award_beenum =", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumNotEqualTo(Integer value) {
            addCriterion("award_beenum <>", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumGreaterThan(Integer value) {
            addCriterion("award_beenum >", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_beenum >=", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumLessThan(Integer value) {
            addCriterion("award_beenum <", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumLessThanOrEqualTo(Integer value) {
            addCriterion("award_beenum <=", value, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumIn(List<Integer> values) {
            addCriterion("award_beenum in", values, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumNotIn(List<Integer> values) {
            addCriterion("award_beenum not in", values, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumBetween(Integer value1, Integer value2) {
            addCriterion("award_beenum between", value1, value2, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardBeenumNotBetween(Integer value1, Integer value2) {
            addCriterion("award_beenum not between", value1, value2, "awardBeenum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumIsNull() {
            addCriterion("award_honeynum is null");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumIsNotNull() {
            addCriterion("award_honeynum is not null");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumEqualTo(BigDecimal value) {
            addCriterion("award_honeynum =", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumNotEqualTo(BigDecimal value) {
            addCriterion("award_honeynum <>", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumGreaterThan(BigDecimal value) {
            addCriterion("award_honeynum >", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_honeynum >=", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumLessThan(BigDecimal value) {
            addCriterion("award_honeynum <", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_honeynum <=", value, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumIn(List<BigDecimal> values) {
            addCriterion("award_honeynum in", values, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumNotIn(List<BigDecimal> values) {
            addCriterion("award_honeynum not in", values, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_honeynum between", value1, value2, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardHoneynumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_honeynum not between", value1, value2, "awardHoneynum");
            return (Criteria) this;
        }

        public Criteria andAwardLimitIsNull() {
            addCriterion("award_limit is null");
            return (Criteria) this;
        }

        public Criteria andAwardLimitIsNotNull() {
            addCriterion("award_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLimitEqualTo(Integer value) {
            addCriterion("award_limit =", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitNotEqualTo(Integer value) {
            addCriterion("award_limit <>", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitGreaterThan(Integer value) {
            addCriterion("award_limit >", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_limit >=", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitLessThan(Integer value) {
            addCriterion("award_limit <", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitLessThanOrEqualTo(Integer value) {
            addCriterion("award_limit <=", value, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitIn(List<Integer> values) {
            addCriterion("award_limit in", values, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitNotIn(List<Integer> values) {
            addCriterion("award_limit not in", values, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitBetween(Integer value1, Integer value2) {
            addCriterion("award_limit between", value1, value2, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andAwardLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("award_limit not between", value1, value2, "awardLimit");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Byte value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Byte value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Byte value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Byte value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Byte value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Byte> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Byte> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Byte value1, Byte value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
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
     * This class corresponds to the database table task
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