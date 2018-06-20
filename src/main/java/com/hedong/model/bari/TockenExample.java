package com.hedong.model.bari;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TockenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TockenExample() {
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

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andChainTypeIsNull() {
            addCriterion("chain_type is null");
            return (Criteria) this;
        }

        public Criteria andChainTypeIsNotNull() {
            addCriterion("chain_type is not null");
            return (Criteria) this;
        }

        public Criteria andChainTypeEqualTo(Byte value) {
            addCriterion("chain_type =", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeNotEqualTo(Byte value) {
            addCriterion("chain_type <>", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeGreaterThan(Byte value) {
            addCriterion("chain_type >", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("chain_type >=", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeLessThan(Byte value) {
            addCriterion("chain_type <", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeLessThanOrEqualTo(Byte value) {
            addCriterion("chain_type <=", value, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeIn(List<Byte> values) {
            addCriterion("chain_type in", values, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeNotIn(List<Byte> values) {
            addCriterion("chain_type not in", values, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeBetween(Byte value1, Byte value2) {
            addCriterion("chain_type between", value1, value2, "chainType");
            return (Criteria) this;
        }

        public Criteria andChainTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("chain_type not between", value1, value2, "chainType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andSeqNumIsNull() {
            addCriterion("seq_num is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("seq_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Integer value) {
            addCriterion("seq_num =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Integer value) {
            addCriterion("seq_num <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Integer value) {
            addCriterion("seq_num >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq_num >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Integer value) {
            addCriterion("seq_num <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Integer value) {
            addCriterion("seq_num <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Integer> values) {
            addCriterion("seq_num in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Integer> values) {
            addCriterion("seq_num not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Integer value1, Integer value2) {
            addCriterion("seq_num between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seq_num not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIsNull() {
            addCriterion("price_usd is null");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIsNotNull() {
            addCriterion("price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUsdEqualTo(BigDecimal value) {
            addCriterion("price_usd =", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotEqualTo(BigDecimal value) {
            addCriterion("price_usd <>", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdGreaterThan(BigDecimal value) {
            addCriterion("price_usd >", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_usd >=", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdLessThan(BigDecimal value) {
            addCriterion("price_usd <", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_usd <=", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIn(List<BigDecimal> values) {
            addCriterion("price_usd in", values, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotIn(List<BigDecimal> values) {
            addCriterion("price_usd not in", values, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_usd between", value1, value2, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_usd not between", value1, value2, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIsNull() {
            addCriterion("price_cny is null");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIsNotNull() {
            addCriterion("price_cny is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCnyEqualTo(BigDecimal value) {
            addCriterion("price_cny =", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotEqualTo(BigDecimal value) {
            addCriterion("price_cny <>", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyGreaterThan(BigDecimal value) {
            addCriterion("price_cny >", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_cny >=", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyLessThan(BigDecimal value) {
            addCriterion("price_cny <", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_cny <=", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIn(List<BigDecimal> values) {
            addCriterion("price_cny in", values, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotIn(List<BigDecimal> values) {
            addCriterion("price_cny not in", values, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_cny between", value1, value2, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_cny not between", value1, value2, "priceCny");
            return (Criteria) this;
        }

        public Criteria andDecimalValIsNull() {
            addCriterion("decimal_val is null");
            return (Criteria) this;
        }

        public Criteria andDecimalValIsNotNull() {
            addCriterion("decimal_val is not null");
            return (Criteria) this;
        }

        public Criteria andDecimalValEqualTo(Byte value) {
            addCriterion("decimal_val =", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValNotEqualTo(Byte value) {
            addCriterion("decimal_val <>", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValGreaterThan(Byte value) {
            addCriterion("decimal_val >", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValGreaterThanOrEqualTo(Byte value) {
            addCriterion("decimal_val >=", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValLessThan(Byte value) {
            addCriterion("decimal_val <", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValLessThanOrEqualTo(Byte value) {
            addCriterion("decimal_val <=", value, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValIn(List<Byte> values) {
            addCriterion("decimal_val in", values, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValNotIn(List<Byte> values) {
            addCriterion("decimal_val not in", values, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValBetween(Byte value1, Byte value2) {
            addCriterion("decimal_val between", value1, value2, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andDecimalValNotBetween(Byte value1, Byte value2) {
            addCriterion("decimal_val not between", value1, value2, "decimalVal");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedIsNull() {
            addCriterion("transfer_gas_used is null");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedIsNotNull() {
            addCriterion("transfer_gas_used is not null");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedEqualTo(Integer value) {
            addCriterion("transfer_gas_used =", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedNotEqualTo(Integer value) {
            addCriterion("transfer_gas_used <>", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedGreaterThan(Integer value) {
            addCriterion("transfer_gas_used >", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfer_gas_used >=", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedLessThan(Integer value) {
            addCriterion("transfer_gas_used <", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedLessThanOrEqualTo(Integer value) {
            addCriterion("transfer_gas_used <=", value, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedIn(List<Integer> values) {
            addCriterion("transfer_gas_used in", values, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedNotIn(List<Integer> values) {
            addCriterion("transfer_gas_used not in", values, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedBetween(Integer value1, Integer value2) {
            addCriterion("transfer_gas_used between", value1, value2, "transferGasUsed");
            return (Criteria) this;
        }

        public Criteria andTransferGasUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("transfer_gas_used not between", value1, value2, "transferGasUsed");
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