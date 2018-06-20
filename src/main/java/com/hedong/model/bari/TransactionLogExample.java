package com.hedong.model.bari;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTokenAddressIsNull() {
            addCriterion("token_address is null");
            return (Criteria) this;
        }

        public Criteria andTokenAddressIsNotNull() {
            addCriterion("token_address is not null");
            return (Criteria) this;
        }

        public Criteria andTokenAddressEqualTo(String value) {
            addCriterion("token_address =", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressNotEqualTo(String value) {
            addCriterion("token_address <>", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressGreaterThan(String value) {
            addCriterion("token_address >", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressGreaterThanOrEqualTo(String value) {
            addCriterion("token_address >=", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressLessThan(String value) {
            addCriterion("token_address <", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressLessThanOrEqualTo(String value) {
            addCriterion("token_address <=", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressLike(String value) {
            addCriterion("token_address like", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressNotLike(String value) {
            addCriterion("token_address not like", value, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressIn(List<String> values) {
            addCriterion("token_address in", values, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressNotIn(List<String> values) {
            addCriterion("token_address not in", values, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressBetween(String value1, String value2) {
            addCriterion("token_address between", value1, value2, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andTokenAddressNotBetween(String value1, String value2) {
            addCriterion("token_address not between", value1, value2, "tokenAddress");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("from like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("from not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("from not between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andToIsNull() {
            addCriterion("to is null");
            return (Criteria) this;
        }

        public Criteria andToIsNotNull() {
            addCriterion("to is not null");
            return (Criteria) this;
        }

        public Criteria andToEqualTo(String value) {
            addCriterion("to =", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotEqualTo(String value) {
            addCriterion("to <>", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThan(String value) {
            addCriterion("to >", value, "to");
            return (Criteria) this;
        }

        public Criteria andToGreaterThanOrEqualTo(String value) {
            addCriterion("to >=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThan(String value) {
            addCriterion("to <", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLessThanOrEqualTo(String value) {
            addCriterion("to <=", value, "to");
            return (Criteria) this;
        }

        public Criteria andToLike(String value) {
            addCriterion("to like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToNotLike(String value) {
            addCriterion("to not like", value, "to");
            return (Criteria) this;
        }

        public Criteria andToIn(List<String> values) {
            addCriterion("to in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToNotIn(List<String> values) {
            addCriterion("to not in", values, "to");
            return (Criteria) this;
        }

        public Criteria andToBetween(String value1, String value2) {
            addCriterion("to between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andToNotBetween(String value1, String value2) {
            addCriterion("to not between", value1, value2, "to");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andGasFeeIsNull() {
            addCriterion("gas_fee is null");
            return (Criteria) this;
        }

        public Criteria andGasFeeIsNotNull() {
            addCriterion("gas_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGasFeeEqualTo(String value) {
            addCriterion("gas_fee =", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeNotEqualTo(String value) {
            addCriterion("gas_fee <>", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeGreaterThan(String value) {
            addCriterion("gas_fee >", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeGreaterThanOrEqualTo(String value) {
            addCriterion("gas_fee >=", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeLessThan(String value) {
            addCriterion("gas_fee <", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeLessThanOrEqualTo(String value) {
            addCriterion("gas_fee <=", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeLike(String value) {
            addCriterion("gas_fee like", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeNotLike(String value) {
            addCriterion("gas_fee not like", value, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeIn(List<String> values) {
            addCriterion("gas_fee in", values, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeNotIn(List<String> values) {
            addCriterion("gas_fee not in", values, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeBetween(String value1, String value2) {
            addCriterion("gas_fee between", value1, value2, "gasFee");
            return (Criteria) this;
        }

        public Criteria andGasFeeNotBetween(String value1, String value2) {
            addCriterion("gas_fee not between", value1, value2, "gasFee");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
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

        public Criteria andTxhashIsNull() {
            addCriterion("txhash is null");
            return (Criteria) this;
        }

        public Criteria andTxhashIsNotNull() {
            addCriterion("txhash is not null");
            return (Criteria) this;
        }

        public Criteria andTxhashEqualTo(String value) {
            addCriterion("txhash =", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashNotEqualTo(String value) {
            addCriterion("txhash <>", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashGreaterThan(String value) {
            addCriterion("txhash >", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashGreaterThanOrEqualTo(String value) {
            addCriterion("txhash >=", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashLessThan(String value) {
            addCriterion("txhash <", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashLessThanOrEqualTo(String value) {
            addCriterion("txhash <=", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashLike(String value) {
            addCriterion("txhash like", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashNotLike(String value) {
            addCriterion("txhash not like", value, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashIn(List<String> values) {
            addCriterion("txhash in", values, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashNotIn(List<String> values) {
            addCriterion("txhash not in", values, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashBetween(String value1, String value2) {
            addCriterion("txhash between", value1, value2, "txhash");
            return (Criteria) this;
        }

        public Criteria andTxhashNotBetween(String value1, String value2) {
            addCriterion("txhash not between", value1, value2, "txhash");
            return (Criteria) this;
        }

        public Criteria andBlockNumIsNull() {
            addCriterion("block_num is null");
            return (Criteria) this;
        }

        public Criteria andBlockNumIsNotNull() {
            addCriterion("block_num is not null");
            return (Criteria) this;
        }

        public Criteria andBlockNumEqualTo(Integer value) {
            addCriterion("block_num =", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumNotEqualTo(Integer value) {
            addCriterion("block_num <>", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumGreaterThan(Integer value) {
            addCriterion("block_num >", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("block_num >=", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumLessThan(Integer value) {
            addCriterion("block_num <", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumLessThanOrEqualTo(Integer value) {
            addCriterion("block_num <=", value, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumIn(List<Integer> values) {
            addCriterion("block_num in", values, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumNotIn(List<Integer> values) {
            addCriterion("block_num not in", values, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumBetween(Integer value1, Integer value2) {
            addCriterion("block_num between", value1, value2, "blockNum");
            return (Criteria) this;
        }

        public Criteria andBlockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("block_num not between", value1, value2, "blockNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNull() {
            addCriterion("time_stamp is null");
            return (Criteria) this;
        }

        public Criteria andTimeStampIsNotNull() {
            addCriterion("time_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStampEqualTo(Integer value) {
            addCriterion("time_stamp =", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotEqualTo(Integer value) {
            addCriterion("time_stamp <>", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThan(Integer value) {
            addCriterion("time_stamp >", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_stamp >=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThan(Integer value) {
            addCriterion("time_stamp <", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampLessThanOrEqualTo(Integer value) {
            addCriterion("time_stamp <=", value, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampIn(List<Integer> values) {
            addCriterion("time_stamp in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotIn(List<Integer> values) {
            addCriterion("time_stamp not in", values, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampBetween(Integer value1, Integer value2) {
            addCriterion("time_stamp between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andTimeStampNotBetween(Integer value1, Integer value2) {
            addCriterion("time_stamp not between", value1, value2, "timeStamp");
            return (Criteria) this;
        }

        public Criteria andNonceIsNull() {
            addCriterion("nonce is null");
            return (Criteria) this;
        }

        public Criteria andNonceIsNotNull() {
            addCriterion("nonce is not null");
            return (Criteria) this;
        }

        public Criteria andNonceEqualTo(Integer value) {
            addCriterion("nonce =", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotEqualTo(Integer value) {
            addCriterion("nonce <>", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThan(Integer value) {
            addCriterion("nonce >", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThanOrEqualTo(Integer value) {
            addCriterion("nonce >=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThan(Integer value) {
            addCriterion("nonce <", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThanOrEqualTo(Integer value) {
            addCriterion("nonce <=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceIn(List<Integer> values) {
            addCriterion("nonce in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotIn(List<Integer> values) {
            addCriterion("nonce not in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceBetween(Integer value1, Integer value2) {
            addCriterion("nonce between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotBetween(Integer value1, Integer value2) {
            addCriterion("nonce not between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andGasPriceIsNull() {
            addCriterion("gas_price is null");
            return (Criteria) this;
        }

        public Criteria andGasPriceIsNotNull() {
            addCriterion("gas_price is not null");
            return (Criteria) this;
        }

        public Criteria andGasPriceEqualTo(String value) {
            addCriterion("gas_price =", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceNotEqualTo(String value) {
            addCriterion("gas_price <>", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceGreaterThan(String value) {
            addCriterion("gas_price >", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceGreaterThanOrEqualTo(String value) {
            addCriterion("gas_price >=", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceLessThan(String value) {
            addCriterion("gas_price <", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceLessThanOrEqualTo(String value) {
            addCriterion("gas_price <=", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceLike(String value) {
            addCriterion("gas_price like", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceNotLike(String value) {
            addCriterion("gas_price not like", value, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceIn(List<String> values) {
            addCriterion("gas_price in", values, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceNotIn(List<String> values) {
            addCriterion("gas_price not in", values, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceBetween(String value1, String value2) {
            addCriterion("gas_price between", value1, value2, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasPriceNotBetween(String value1, String value2) {
            addCriterion("gas_price not between", value1, value2, "gasPrice");
            return (Criteria) this;
        }

        public Criteria andGasLimitIsNull() {
            addCriterion("gas_limit is null");
            return (Criteria) this;
        }

        public Criteria andGasLimitIsNotNull() {
            addCriterion("gas_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGasLimitEqualTo(String value) {
            addCriterion("gas_limit =", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitNotEqualTo(String value) {
            addCriterion("gas_limit <>", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitGreaterThan(String value) {
            addCriterion("gas_limit >", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitGreaterThanOrEqualTo(String value) {
            addCriterion("gas_limit >=", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitLessThan(String value) {
            addCriterion("gas_limit <", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitLessThanOrEqualTo(String value) {
            addCriterion("gas_limit <=", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitLike(String value) {
            addCriterion("gas_limit like", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitNotLike(String value) {
            addCriterion("gas_limit not like", value, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitIn(List<String> values) {
            addCriterion("gas_limit in", values, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitNotIn(List<String> values) {
            addCriterion("gas_limit not in", values, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitBetween(String value1, String value2) {
            addCriterion("gas_limit between", value1, value2, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasLimitNotBetween(String value1, String value2) {
            addCriterion("gas_limit not between", value1, value2, "gasLimit");
            return (Criteria) this;
        }

        public Criteria andGasUsedIsNull() {
            addCriterion("gas_used is null");
            return (Criteria) this;
        }

        public Criteria andGasUsedIsNotNull() {
            addCriterion("gas_used is not null");
            return (Criteria) this;
        }

        public Criteria andGasUsedEqualTo(String value) {
            addCriterion("gas_used =", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedNotEqualTo(String value) {
            addCriterion("gas_used <>", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedGreaterThan(String value) {
            addCriterion("gas_used >", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedGreaterThanOrEqualTo(String value) {
            addCriterion("gas_used >=", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedLessThan(String value) {
            addCriterion("gas_used <", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedLessThanOrEqualTo(String value) {
            addCriterion("gas_used <=", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedLike(String value) {
            addCriterion("gas_used like", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedNotLike(String value) {
            addCriterion("gas_used not like", value, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedIn(List<String> values) {
            addCriterion("gas_used in", values, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedNotIn(List<String> values) {
            addCriterion("gas_used not in", values, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedBetween(String value1, String value2) {
            addCriterion("gas_used between", value1, value2, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andGasUsedNotBetween(String value1, String value2) {
            addCriterion("gas_used not between", value1, value2, "gasUsed");
            return (Criteria) this;
        }

        public Criteria andLastTxHashIsNull() {
            addCriterion("last_tx_hash is null");
            return (Criteria) this;
        }

        public Criteria andLastTxHashIsNotNull() {
            addCriterion("last_tx_hash is not null");
            return (Criteria) this;
        }

        public Criteria andLastTxHashEqualTo(String value) {
            addCriterion("last_tx_hash =", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashNotEqualTo(String value) {
            addCriterion("last_tx_hash <>", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashGreaterThan(String value) {
            addCriterion("last_tx_hash >", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashGreaterThanOrEqualTo(String value) {
            addCriterion("last_tx_hash >=", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashLessThan(String value) {
            addCriterion("last_tx_hash <", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashLessThanOrEqualTo(String value) {
            addCriterion("last_tx_hash <=", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashLike(String value) {
            addCriterion("last_tx_hash like", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashNotLike(String value) {
            addCriterion("last_tx_hash not like", value, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashIn(List<String> values) {
            addCriterion("last_tx_hash in", values, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashNotIn(List<String> values) {
            addCriterion("last_tx_hash not in", values, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashBetween(String value1, String value2) {
            addCriterion("last_tx_hash between", value1, value2, "lastTxHash");
            return (Criteria) this;
        }

        public Criteria andLastTxHashNotBetween(String value1, String value2) {
            addCriterion("last_tx_hash not between", value1, value2, "lastTxHash");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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