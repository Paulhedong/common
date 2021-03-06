package com.hedong.model.turin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table friends
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public FriendsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
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
     * This method corresponds to the database table friends
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
     * This method corresponds to the database table friends
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
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
     * This class corresponds to the database table friends
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

        public Criteria andFriendStatusIsNull() {
            addCriterion("friend_status is null");
            return (Criteria) this;
        }

        public Criteria andFriendStatusIsNotNull() {
            addCriterion("friend_status is not null");
            return (Criteria) this;
        }

        public Criteria andFriendStatusEqualTo(Integer value) {
            addCriterion("friend_status =", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotEqualTo(Integer value) {
            addCriterion("friend_status <>", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusGreaterThan(Integer value) {
            addCriterion("friend_status >", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("friend_status >=", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusLessThan(Integer value) {
            addCriterion("friend_status <", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusLessThanOrEqualTo(Integer value) {
            addCriterion("friend_status <=", value, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusIn(List<Integer> values) {
            addCriterion("friend_status in", values, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotIn(List<Integer> values) {
            addCriterion("friend_status not in", values, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusBetween(Integer value1, Integer value2) {
            addCriterion("friend_status between", value1, value2, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFriendStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("friend_status not between", value1, value2, "friendStatus");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressIsNull() {
            addCriterion("from_user_address is null");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressIsNotNull() {
            addCriterion("from_user_address is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressEqualTo(String value) {
            addCriterion("from_user_address =", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressNotEqualTo(String value) {
            addCriterion("from_user_address <>", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressGreaterThan(String value) {
            addCriterion("from_user_address >", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_user_address >=", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressLessThan(String value) {
            addCriterion("from_user_address <", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressLessThanOrEqualTo(String value) {
            addCriterion("from_user_address <=", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressLike(String value) {
            addCriterion("from_user_address like", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressNotLike(String value) {
            addCriterion("from_user_address not like", value, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressIn(List<String> values) {
            addCriterion("from_user_address in", values, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressNotIn(List<String> values) {
            addCriterion("from_user_address not in", values, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressBetween(String value1, String value2) {
            addCriterion("from_user_address between", value1, value2, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserAddressNotBetween(String value1, String value2) {
            addCriterion("from_user_address not between", value1, value2, "fromUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressIsNull() {
            addCriterion("to_user_address is null");
            return (Criteria) this;
        }

        public Criteria andToUserAddressIsNotNull() {
            addCriterion("to_user_address is not null");
            return (Criteria) this;
        }

        public Criteria andToUserAddressEqualTo(String value) {
            addCriterion("to_user_address =", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressNotEqualTo(String value) {
            addCriterion("to_user_address <>", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressGreaterThan(String value) {
            addCriterion("to_user_address >", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_address >=", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressLessThan(String value) {
            addCriterion("to_user_address <", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressLessThanOrEqualTo(String value) {
            addCriterion("to_user_address <=", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressLike(String value) {
            addCriterion("to_user_address like", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressNotLike(String value) {
            addCriterion("to_user_address not like", value, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressIn(List<String> values) {
            addCriterion("to_user_address in", values, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressNotIn(List<String> values) {
            addCriterion("to_user_address not in", values, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressBetween(String value1, String value2) {
            addCriterion("to_user_address between", value1, value2, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andToUserAddressNotBetween(String value1, String value2) {
            addCriterion("to_user_address not between", value1, value2, "toUserAddress");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNull() {
            addCriterion("from_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("from_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(String value) {
            addCriterion("from_user_id =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(String value) {
            addCriterion("from_user_id <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(String value) {
            addCriterion("from_user_id >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_user_id >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(String value) {
            addCriterion("from_user_id <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(String value) {
            addCriterion("from_user_id <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLike(String value) {
            addCriterion("from_user_id like", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotLike(String value) {
            addCriterion("from_user_id not like", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<String> values) {
            addCriterion("from_user_id in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<String> values) {
            addCriterion("from_user_id not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(String value1, String value2) {
            addCriterion("from_user_id between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(String value1, String value2) {
            addCriterion("from_user_id not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(String value) {
            addCriterion("to_user_id =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(String value) {
            addCriterion("to_user_id <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(String value) {
            addCriterion("to_user_id >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_id >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(String value) {
            addCriterion("to_user_id <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(String value) {
            addCriterion("to_user_id <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLike(String value) {
            addCriterion("to_user_id like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotLike(String value) {
            addCriterion("to_user_id not like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<String> values) {
            addCriterion("to_user_id in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<String> values) {
            addCriterion("to_user_id not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(String value1, String value2) {
            addCriterion("to_user_id between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(String value1, String value2) {
            addCriterion("to_user_id not between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIsNull() {
            addCriterion("friend_remark is null");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIsNotNull() {
            addCriterion("friend_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkEqualTo(String value) {
            addCriterion("friend_remark =", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotEqualTo(String value) {
            addCriterion("friend_remark <>", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkGreaterThan(String value) {
            addCriterion("friend_remark >", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("friend_remark >=", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLessThan(String value) {
            addCriterion("friend_remark <", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLessThanOrEqualTo(String value) {
            addCriterion("friend_remark <=", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLike(String value) {
            addCriterion("friend_remark like", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotLike(String value) {
            addCriterion("friend_remark not like", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIn(List<String> values) {
            addCriterion("friend_remark in", values, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotIn(List<String> values) {
            addCriterion("friend_remark not in", values, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkBetween(String value1, String value2) {
            addCriterion("friend_remark between", value1, value2, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotBetween(String value1, String value2) {
            addCriterion("friend_remark not between", value1, value2, "friendRemark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table friends
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
     * This class corresponds to the database table friends
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