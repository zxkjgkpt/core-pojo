package com.yfny.corepojo.entity.demandform.model;

import java.util.ArrayList;
import java.util.List;

public class XqdYhxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XqdYhxxExample() {
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

        public Criteria andYhIdIsNull() {
            addCriterion("YH_ID is null");
            return (Criteria) this;
        }

        public Criteria andYhIdIsNotNull() {
            addCriterion("YH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYhIdEqualTo(String value) {
            addCriterion("YH_ID =", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotEqualTo(String value) {
            addCriterion("YH_ID <>", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThan(String value) {
            addCriterion("YH_ID >", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdGreaterThanOrEqualTo(String value) {
            addCriterion("YH_ID >=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThan(String value) {
            addCriterion("YH_ID <", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLessThanOrEqualTo(String value) {
            addCriterion("YH_ID <=", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdLike(String value) {
            addCriterion("YH_ID like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotLike(String value) {
            addCriterion("YH_ID not like", value, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdIn(List<String> values) {
            addCriterion("YH_ID in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotIn(List<String> values) {
            addCriterion("YH_ID not in", values, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdBetween(String value1, String value2) {
            addCriterion("YH_ID between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andYhIdNotBetween(String value1, String value2) {
            addCriterion("YH_ID not between", value1, value2, "yhId");
            return (Criteria) this;
        }

        public Criteria andZzIdIsNull() {
            addCriterion("ZZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andZzIdIsNotNull() {
            addCriterion("ZZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZzIdEqualTo(String value) {
            addCriterion("ZZ_ID =", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdNotEqualTo(String value) {
            addCriterion("ZZ_ID <>", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdGreaterThan(String value) {
            addCriterion("ZZ_ID >", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZZ_ID >=", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdLessThan(String value) {
            addCriterion("ZZ_ID <", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdLessThanOrEqualTo(String value) {
            addCriterion("ZZ_ID <=", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdLike(String value) {
            addCriterion("ZZ_ID like", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdNotLike(String value) {
            addCriterion("ZZ_ID not like", value, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdIn(List<String> values) {
            addCriterion("ZZ_ID in", values, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdNotIn(List<String> values) {
            addCriterion("ZZ_ID not in", values, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdBetween(String value1, String value2) {
            addCriterion("ZZ_ID between", value1, value2, "zzId");
            return (Criteria) this;
        }

        public Criteria andZzIdNotBetween(String value1, String value2) {
            addCriterion("ZZ_ID not between", value1, value2, "zzId");
            return (Criteria) this;
        }

        public Criteria andKhIdIsNull() {
            addCriterion("KH_ID is null");
            return (Criteria) this;
        }

        public Criteria andKhIdIsNotNull() {
            addCriterion("KH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKhIdEqualTo(String value) {
            addCriterion("KH_ID =", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdNotEqualTo(String value) {
            addCriterion("KH_ID <>", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdGreaterThan(String value) {
            addCriterion("KH_ID >", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdGreaterThanOrEqualTo(String value) {
            addCriterion("KH_ID >=", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdLessThan(String value) {
            addCriterion("KH_ID <", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdLessThanOrEqualTo(String value) {
            addCriterion("KH_ID <=", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdLike(String value) {
            addCriterion("KH_ID like", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdNotLike(String value) {
            addCriterion("KH_ID not like", value, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdIn(List<String> values) {
            addCriterion("KH_ID in", values, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdNotIn(List<String> values) {
            addCriterion("KH_ID not in", values, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdBetween(String value1, String value2) {
            addCriterion("KH_ID between", value1, value2, "khId");
            return (Criteria) this;
        }

        public Criteria andKhIdNotBetween(String value1, String value2) {
            addCriterion("KH_ID not between", value1, value2, "khId");
            return (Criteria) this;
        }

        public Criteria andYhxmIsNull() {
            addCriterion("YHXM is null");
            return (Criteria) this;
        }

        public Criteria andYhxmIsNotNull() {
            addCriterion("YHXM is not null");
            return (Criteria) this;
        }

        public Criteria andYhxmEqualTo(String value) {
            addCriterion("YHXM =", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmNotEqualTo(String value) {
            addCriterion("YHXM <>", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmGreaterThan(String value) {
            addCriterion("YHXM >", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmGreaterThanOrEqualTo(String value) {
            addCriterion("YHXM >=", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmLessThan(String value) {
            addCriterion("YHXM <", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmLessThanOrEqualTo(String value) {
            addCriterion("YHXM <=", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmLike(String value) {
            addCriterion("YHXM like", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmNotLike(String value) {
            addCriterion("YHXM not like", value, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmIn(List<String> values) {
            addCriterion("YHXM in", values, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmNotIn(List<String> values) {
            addCriterion("YHXM not in", values, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmBetween(String value1, String value2) {
            addCriterion("YHXM between", value1, value2, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhxmNotBetween(String value1, String value2) {
            addCriterion("YHXM not between", value1, value2, "yhxm");
            return (Criteria) this;
        }

        public Criteria andYhmIsNull() {
            addCriterion("YHM is null");
            return (Criteria) this;
        }

        public Criteria andYhmIsNotNull() {
            addCriterion("YHM is not null");
            return (Criteria) this;
        }

        public Criteria andYhmEqualTo(String value) {
            addCriterion("YHM =", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmNotEqualTo(String value) {
            addCriterion("YHM <>", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmGreaterThan(String value) {
            addCriterion("YHM >", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmGreaterThanOrEqualTo(String value) {
            addCriterion("YHM >=", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmLessThan(String value) {
            addCriterion("YHM <", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmLessThanOrEqualTo(String value) {
            addCriterion("YHM <=", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmLike(String value) {
            addCriterion("YHM like", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmNotLike(String value) {
            addCriterion("YHM not like", value, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmIn(List<String> values) {
            addCriterion("YHM in", values, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmNotIn(List<String> values) {
            addCriterion("YHM not in", values, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmBetween(String value1, String value2) {
            addCriterion("YHM between", value1, value2, "yhm");
            return (Criteria) this;
        }

        public Criteria andYhmNotBetween(String value1, String value2) {
            addCriterion("YHM not between", value1, value2, "yhm");
            return (Criteria) this;
        }

        public Criteria andMmIsNull() {
            addCriterion("MM is null");
            return (Criteria) this;
        }

        public Criteria andMmIsNotNull() {
            addCriterion("MM is not null");
            return (Criteria) this;
        }

        public Criteria andMmEqualTo(String value) {
            addCriterion("MM =", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotEqualTo(String value) {
            addCriterion("MM <>", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThan(String value) {
            addCriterion("MM >", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThanOrEqualTo(String value) {
            addCriterion("MM >=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThan(String value) {
            addCriterion("MM <", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThanOrEqualTo(String value) {
            addCriterion("MM <=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLike(String value) {
            addCriterion("MM like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotLike(String value) {
            addCriterion("MM not like", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmIn(List<String> values) {
            addCriterion("MM in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotIn(List<String> values) {
            addCriterion("MM not in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmBetween(String value1, String value2) {
            addCriterion("MM between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotBetween(String value1, String value2) {
            addCriterion("MM not between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andYhmsIsNull() {
            addCriterion("YHMS is null");
            return (Criteria) this;
        }

        public Criteria andYhmsIsNotNull() {
            addCriterion("YHMS is not null");
            return (Criteria) this;
        }

        public Criteria andYhmsEqualTo(String value) {
            addCriterion("YHMS =", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsNotEqualTo(String value) {
            addCriterion("YHMS <>", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsGreaterThan(String value) {
            addCriterion("YHMS >", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsGreaterThanOrEqualTo(String value) {
            addCriterion("YHMS >=", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsLessThan(String value) {
            addCriterion("YHMS <", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsLessThanOrEqualTo(String value) {
            addCriterion("YHMS <=", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsLike(String value) {
            addCriterion("YHMS like", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsNotLike(String value) {
            addCriterion("YHMS not like", value, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsIn(List<String> values) {
            addCriterion("YHMS in", values, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsNotIn(List<String> values) {
            addCriterion("YHMS not in", values, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsBetween(String value1, String value2) {
            addCriterion("YHMS between", value1, value2, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhmsNotBetween(String value1, String value2) {
            addCriterion("YHMS not between", value1, value2, "yhms");
            return (Criteria) this;
        }

        public Criteria andYhxbIsNull() {
            addCriterion("YHXB is null");
            return (Criteria) this;
        }

        public Criteria andYhxbIsNotNull() {
            addCriterion("YHXB is not null");
            return (Criteria) this;
        }

        public Criteria andYhxbEqualTo(Short value) {
            addCriterion("YHXB =", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbNotEqualTo(Short value) {
            addCriterion("YHXB <>", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbGreaterThan(Short value) {
            addCriterion("YHXB >", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbGreaterThanOrEqualTo(Short value) {
            addCriterion("YHXB >=", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbLessThan(Short value) {
            addCriterion("YHXB <", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbLessThanOrEqualTo(Short value) {
            addCriterion("YHXB <=", value, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbIn(List<Short> values) {
            addCriterion("YHXB in", values, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbNotIn(List<Short> values) {
            addCriterion("YHXB not in", values, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbBetween(Short value1, Short value2) {
            addCriterion("YHXB between", value1, value2, "yhxb");
            return (Criteria) this;
        }

        public Criteria andYhxbNotBetween(Short value1, Short value2) {
            addCriterion("YHXB not between", value1, value2, "yhxb");
            return (Criteria) this;
        }

        public Criteria andSrIsNull() {
            addCriterion("SR is null");
            return (Criteria) this;
        }

        public Criteria andSrIsNotNull() {
            addCriterion("SR is not null");
            return (Criteria) this;
        }

        public Criteria andSrEqualTo(String value) {
            addCriterion("SR =", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotEqualTo(String value) {
            addCriterion("SR <>", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrGreaterThan(String value) {
            addCriterion("SR >", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrGreaterThanOrEqualTo(String value) {
            addCriterion("SR >=", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLessThan(String value) {
            addCriterion("SR <", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLessThanOrEqualTo(String value) {
            addCriterion("SR <=", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrLike(String value) {
            addCriterion("SR like", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotLike(String value) {
            addCriterion("SR not like", value, "sr");
            return (Criteria) this;
        }

        public Criteria andSrIn(List<String> values) {
            addCriterion("SR in", values, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotIn(List<String> values) {
            addCriterion("SR not in", values, "sr");
            return (Criteria) this;
        }

        public Criteria andSrBetween(String value1, String value2) {
            addCriterion("SR between", value1, value2, "sr");
            return (Criteria) this;
        }

        public Criteria andSrNotBetween(String value1, String value2) {
            addCriterion("SR not between", value1, value2, "sr");
            return (Criteria) this;
        }

        public Criteria andCsdIsNull() {
            addCriterion("CSD is null");
            return (Criteria) this;
        }

        public Criteria andCsdIsNotNull() {
            addCriterion("CSD is not null");
            return (Criteria) this;
        }

        public Criteria andCsdEqualTo(String value) {
            addCriterion("CSD =", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotEqualTo(String value) {
            addCriterion("CSD <>", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThan(String value) {
            addCriterion("CSD >", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThanOrEqualTo(String value) {
            addCriterion("CSD >=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThan(String value) {
            addCriterion("CSD <", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThanOrEqualTo(String value) {
            addCriterion("CSD <=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLike(String value) {
            addCriterion("CSD like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotLike(String value) {
            addCriterion("CSD not like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdIn(List<String> values) {
            addCriterion("CSD in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotIn(List<String> values) {
            addCriterion("CSD not in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdBetween(String value1, String value2) {
            addCriterion("CSD between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotBetween(String value1, String value2) {
            addCriterion("CSD not between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("MZ is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("MZ is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("MZ =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("MZ <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("MZ >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("MZ >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("MZ <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("MZ <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("MZ like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("MZ not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("MZ in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("MZ not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("MZ between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("MZ not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("ZZMM is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("ZZMM is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("ZZMM =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("ZZMM <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("ZZMM >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZMM >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("ZZMM <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("ZZMM <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("ZZMM like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("ZZMM not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("ZZMM in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("ZZMM not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("ZZMM between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("ZZMM not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("ZW is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("ZW is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("ZW =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("ZW <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("ZW >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("ZW >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("ZW <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("ZW <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("ZW like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("ZW not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("ZW in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("ZW not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("ZW between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("ZW not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andDh1IsNull() {
            addCriterion("DH1 is null");
            return (Criteria) this;
        }

        public Criteria andDh1IsNotNull() {
            addCriterion("DH1 is not null");
            return (Criteria) this;
        }

        public Criteria andDh1EqualTo(String value) {
            addCriterion("DH1 =", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1NotEqualTo(String value) {
            addCriterion("DH1 <>", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1GreaterThan(String value) {
            addCriterion("DH1 >", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1GreaterThanOrEqualTo(String value) {
            addCriterion("DH1 >=", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1LessThan(String value) {
            addCriterion("DH1 <", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1LessThanOrEqualTo(String value) {
            addCriterion("DH1 <=", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1Like(String value) {
            addCriterion("DH1 like", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1NotLike(String value) {
            addCriterion("DH1 not like", value, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1In(List<String> values) {
            addCriterion("DH1 in", values, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1NotIn(List<String> values) {
            addCriterion("DH1 not in", values, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1Between(String value1, String value2) {
            addCriterion("DH1 between", value1, value2, "dh1");
            return (Criteria) this;
        }

        public Criteria andDh1NotBetween(String value1, String value2) {
            addCriterion("DH1 not between", value1, value2, "dh1");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("CJSJ like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("CJSJ not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSjIsNull() {
            addCriterion("SJ is null");
            return (Criteria) this;
        }

        public Criteria andSjIsNotNull() {
            addCriterion("SJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjEqualTo(String value) {
            addCriterion("SJ =", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotEqualTo(String value) {
            addCriterion("SJ <>", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThan(String value) {
            addCriterion("SJ >", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjGreaterThanOrEqualTo(String value) {
            addCriterion("SJ >=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThan(String value) {
            addCriterion("SJ <", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLessThanOrEqualTo(String value) {
            addCriterion("SJ <=", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjLike(String value) {
            addCriterion("SJ like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotLike(String value) {
            addCriterion("SJ not like", value, "sj");
            return (Criteria) this;
        }

        public Criteria andSjIn(List<String> values) {
            addCriterion("SJ in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotIn(List<String> values) {
            addCriterion("SJ not in", values, "sj");
            return (Criteria) this;
        }

        public Criteria andSjBetween(String value1, String value2) {
            addCriterion("SJ between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andSjNotBetween(String value1, String value2) {
            addCriterion("SJ not between", value1, value2, "sj");
            return (Criteria) this;
        }

        public Criteria andDh2IsNull() {
            addCriterion("DH2 is null");
            return (Criteria) this;
        }

        public Criteria andDh2IsNotNull() {
            addCriterion("DH2 is not null");
            return (Criteria) this;
        }

        public Criteria andDh2EqualTo(String value) {
            addCriterion("DH2 =", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2NotEqualTo(String value) {
            addCriterion("DH2 <>", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2GreaterThan(String value) {
            addCriterion("DH2 >", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2GreaterThanOrEqualTo(String value) {
            addCriterion("DH2 >=", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2LessThan(String value) {
            addCriterion("DH2 <", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2LessThanOrEqualTo(String value) {
            addCriterion("DH2 <=", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2Like(String value) {
            addCriterion("DH2 like", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2NotLike(String value) {
            addCriterion("DH2 not like", value, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2In(List<String> values) {
            addCriterion("DH2 in", values, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2NotIn(List<String> values) {
            addCriterion("DH2 not in", values, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2Between(String value1, String value2) {
            addCriterion("DH2 between", value1, value2, "dh2");
            return (Criteria) this;
        }

        public Criteria andDh2NotBetween(String value1, String value2) {
            addCriterion("DH2 not between", value1, value2, "dh2");
            return (Criteria) this;
        }

        public Criteria andSj2IsNull() {
            addCriterion("SJ2 is null");
            return (Criteria) this;
        }

        public Criteria andSj2IsNotNull() {
            addCriterion("SJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andSj2EqualTo(String value) {
            addCriterion("SJ2 =", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2NotEqualTo(String value) {
            addCriterion("SJ2 <>", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2GreaterThan(String value) {
            addCriterion("SJ2 >", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2GreaterThanOrEqualTo(String value) {
            addCriterion("SJ2 >=", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2LessThan(String value) {
            addCriterion("SJ2 <", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2LessThanOrEqualTo(String value) {
            addCriterion("SJ2 <=", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2Like(String value) {
            addCriterion("SJ2 like", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2NotLike(String value) {
            addCriterion("SJ2 not like", value, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2In(List<String> values) {
            addCriterion("SJ2 in", values, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2NotIn(List<String> values) {
            addCriterion("SJ2 not in", values, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2Between(String value1, String value2) {
            addCriterion("SJ2 between", value1, value2, "sj2");
            return (Criteria) this;
        }

        public Criteria andSj2NotBetween(String value1, String value2) {
            addCriterion("SJ2 not between", value1, value2, "sj2");
            return (Criteria) this;
        }

        public Criteria andYhmszmIsNull() {
            addCriterion("YHMSZM is null");
            return (Criteria) this;
        }

        public Criteria andYhmszmIsNotNull() {
            addCriterion("YHMSZM is not null");
            return (Criteria) this;
        }

        public Criteria andYhmszmEqualTo(String value) {
            addCriterion("YHMSZM =", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmNotEqualTo(String value) {
            addCriterion("YHMSZM <>", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmGreaterThan(String value) {
            addCriterion("YHMSZM >", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmGreaterThanOrEqualTo(String value) {
            addCriterion("YHMSZM >=", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmLessThan(String value) {
            addCriterion("YHMSZM <", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmLessThanOrEqualTo(String value) {
            addCriterion("YHMSZM <=", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmLike(String value) {
            addCriterion("YHMSZM like", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmNotLike(String value) {
            addCriterion("YHMSZM not like", value, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmIn(List<String> values) {
            addCriterion("YHMSZM in", values, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmNotIn(List<String> values) {
            addCriterion("YHMSZM not in", values, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmBetween(String value1, String value2) {
            addCriterion("YHMSZM between", value1, value2, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andYhmszmNotBetween(String value1, String value2) {
            addCriterion("YHMSZM not between", value1, value2, "yhmszm");
            return (Criteria) this;
        }

        public Criteria andZjmIsNull() {
            addCriterion("ZJM is null");
            return (Criteria) this;
        }

        public Criteria andZjmIsNotNull() {
            addCriterion("ZJM is not null");
            return (Criteria) this;
        }

        public Criteria andZjmEqualTo(String value) {
            addCriterion("ZJM =", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmNotEqualTo(String value) {
            addCriterion("ZJM <>", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmGreaterThan(String value) {
            addCriterion("ZJM >", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmGreaterThanOrEqualTo(String value) {
            addCriterion("ZJM >=", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmLessThan(String value) {
            addCriterion("ZJM <", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmLessThanOrEqualTo(String value) {
            addCriterion("ZJM <=", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmLike(String value) {
            addCriterion("ZJM like", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmNotLike(String value) {
            addCriterion("ZJM not like", value, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmIn(List<String> values) {
            addCriterion("ZJM in", values, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmNotIn(List<String> values) {
            addCriterion("ZJM not in", values, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmBetween(String value1, String value2) {
            addCriterion("ZJM between", value1, value2, "zjm");
            return (Criteria) this;
        }

        public Criteria andZjmNotBetween(String value1, String value2) {
            addCriterion("ZJM not between", value1, value2, "zjm");
            return (Criteria) this;
        }

        public Criteria andYb1IsNull() {
            addCriterion("YB1 is null");
            return (Criteria) this;
        }

        public Criteria andYb1IsNotNull() {
            addCriterion("YB1 is not null");
            return (Criteria) this;
        }

        public Criteria andYb1EqualTo(String value) {
            addCriterion("YB1 =", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1NotEqualTo(String value) {
            addCriterion("YB1 <>", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1GreaterThan(String value) {
            addCriterion("YB1 >", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1GreaterThanOrEqualTo(String value) {
            addCriterion("YB1 >=", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1LessThan(String value) {
            addCriterion("YB1 <", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1LessThanOrEqualTo(String value) {
            addCriterion("YB1 <=", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1Like(String value) {
            addCriterion("YB1 like", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1NotLike(String value) {
            addCriterion("YB1 not like", value, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1In(List<String> values) {
            addCriterion("YB1 in", values, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1NotIn(List<String> values) {
            addCriterion("YB1 not in", values, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1Between(String value1, String value2) {
            addCriterion("YB1 between", value1, value2, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb1NotBetween(String value1, String value2) {
            addCriterion("YB1 not between", value1, value2, "yb1");
            return (Criteria) this;
        }

        public Criteria andYb2IsNull() {
            addCriterion("YB2 is null");
            return (Criteria) this;
        }

        public Criteria andYb2IsNotNull() {
            addCriterion("YB2 is not null");
            return (Criteria) this;
        }

        public Criteria andYb2EqualTo(String value) {
            addCriterion("YB2 =", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2NotEqualTo(String value) {
            addCriterion("YB2 <>", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2GreaterThan(String value) {
            addCriterion("YB2 >", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2GreaterThanOrEqualTo(String value) {
            addCriterion("YB2 >=", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2LessThan(String value) {
            addCriterion("YB2 <", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2LessThanOrEqualTo(String value) {
            addCriterion("YB2 <=", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2Like(String value) {
            addCriterion("YB2 like", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2NotLike(String value) {
            addCriterion("YB2 not like", value, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2In(List<String> values) {
            addCriterion("YB2 in", values, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2NotIn(List<String> values) {
            addCriterion("YB2 not in", values, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2Between(String value1, String value2) {
            addCriterion("YB2 between", value1, value2, "yb2");
            return (Criteria) this;
        }

        public Criteria andYb2NotBetween(String value1, String value2) {
            addCriterion("YB2 not between", value1, value2, "yb2");
            return (Criteria) this;
        }

        public Criteria andWkdzIsNull() {
            addCriterion("WKDZ is null");
            return (Criteria) this;
        }

        public Criteria andWkdzIsNotNull() {
            addCriterion("WKDZ is not null");
            return (Criteria) this;
        }

        public Criteria andWkdzEqualTo(String value) {
            addCriterion("WKDZ =", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzNotEqualTo(String value) {
            addCriterion("WKDZ <>", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzGreaterThan(String value) {
            addCriterion("WKDZ >", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzGreaterThanOrEqualTo(String value) {
            addCriterion("WKDZ >=", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzLessThan(String value) {
            addCriterion("WKDZ <", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzLessThanOrEqualTo(String value) {
            addCriterion("WKDZ <=", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzLike(String value) {
            addCriterion("WKDZ like", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzNotLike(String value) {
            addCriterion("WKDZ not like", value, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzIn(List<String> values) {
            addCriterion("WKDZ in", values, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzNotIn(List<String> values) {
            addCriterion("WKDZ not in", values, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzBetween(String value1, String value2) {
            addCriterion("WKDZ between", value1, value2, "wkdz");
            return (Criteria) this;
        }

        public Criteria andWkdzNotBetween(String value1, String value2) {
            addCriterion("WKDZ not between", value1, value2, "wkdz");
            return (Criteria) this;
        }

        public Criteria andIpdzIsNull() {
            addCriterion("IPDZ is null");
            return (Criteria) this;
        }

        public Criteria andIpdzIsNotNull() {
            addCriterion("IPDZ is not null");
            return (Criteria) this;
        }

        public Criteria andIpdzEqualTo(String value) {
            addCriterion("IPDZ =", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzNotEqualTo(String value) {
            addCriterion("IPDZ <>", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzGreaterThan(String value) {
            addCriterion("IPDZ >", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzGreaterThanOrEqualTo(String value) {
            addCriterion("IPDZ >=", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzLessThan(String value) {
            addCriterion("IPDZ <", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzLessThanOrEqualTo(String value) {
            addCriterion("IPDZ <=", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzLike(String value) {
            addCriterion("IPDZ like", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzNotLike(String value) {
            addCriterion("IPDZ not like", value, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzIn(List<String> values) {
            addCriterion("IPDZ in", values, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzNotIn(List<String> values) {
            addCriterion("IPDZ not in", values, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzBetween(String value1, String value2) {
            addCriterion("IPDZ between", value1, value2, "ipdz");
            return (Criteria) this;
        }

        public Criteria andIpdzNotBetween(String value1, String value2) {
            addCriterion("IPDZ not between", value1, value2, "ipdz");
            return (Criteria) this;
        }

        public Criteria andJdrqIsNull() {
            addCriterion("JDRQ is null");
            return (Criteria) this;
        }

        public Criteria andJdrqIsNotNull() {
            addCriterion("JDRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJdrqEqualTo(String value) {
            addCriterion("JDRQ =", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqNotEqualTo(String value) {
            addCriterion("JDRQ <>", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqGreaterThan(String value) {
            addCriterion("JDRQ >", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqGreaterThanOrEqualTo(String value) {
            addCriterion("JDRQ >=", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqLessThan(String value) {
            addCriterion("JDRQ <", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqLessThanOrEqualTo(String value) {
            addCriterion("JDRQ <=", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqLike(String value) {
            addCriterion("JDRQ like", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqNotLike(String value) {
            addCriterion("JDRQ not like", value, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqIn(List<String> values) {
            addCriterion("JDRQ in", values, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqNotIn(List<String> values) {
            addCriterion("JDRQ not in", values, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqBetween(String value1, String value2) {
            addCriterion("JDRQ between", value1, value2, "jdrq");
            return (Criteria) this;
        }

        public Criteria andJdrqNotBetween(String value1, String value2) {
            addCriterion("JDRQ not between", value1, value2, "jdrq");
            return (Criteria) this;
        }

        public Criteria andZxrqIsNull() {
            addCriterion("ZXRQ is null");
            return (Criteria) this;
        }

        public Criteria andZxrqIsNotNull() {
            addCriterion("ZXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andZxrqEqualTo(String value) {
            addCriterion("ZXRQ =", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotEqualTo(String value) {
            addCriterion("ZXRQ <>", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqGreaterThan(String value) {
            addCriterion("ZXRQ >", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqGreaterThanOrEqualTo(String value) {
            addCriterion("ZXRQ >=", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqLessThan(String value) {
            addCriterion("ZXRQ <", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqLessThanOrEqualTo(String value) {
            addCriterion("ZXRQ <=", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqLike(String value) {
            addCriterion("ZXRQ like", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotLike(String value) {
            addCriterion("ZXRQ not like", value, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqIn(List<String> values) {
            addCriterion("ZXRQ in", values, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotIn(List<String> values) {
            addCriterion("ZXRQ not in", values, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqBetween(String value1, String value2) {
            addCriterion("ZXRQ between", value1, value2, "zxrq");
            return (Criteria) this;
        }

        public Criteria andZxrqNotBetween(String value1, String value2) {
            addCriterion("ZXRQ not between", value1, value2, "zxrq");
            return (Criteria) this;
        }

        public Criteria andDjztIsNull() {
            addCriterion("DJZT is null");
            return (Criteria) this;
        }

        public Criteria andDjztIsNotNull() {
            addCriterion("DJZT is not null");
            return (Criteria) this;
        }

        public Criteria andDjztEqualTo(Short value) {
            addCriterion("DJZT =", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztNotEqualTo(Short value) {
            addCriterion("DJZT <>", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztGreaterThan(Short value) {
            addCriterion("DJZT >", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztGreaterThanOrEqualTo(Short value) {
            addCriterion("DJZT >=", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztLessThan(Short value) {
            addCriterion("DJZT <", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztLessThanOrEqualTo(Short value) {
            addCriterion("DJZT <=", value, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztIn(List<Short> values) {
            addCriterion("DJZT in", values, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztNotIn(List<Short> values) {
            addCriterion("DJZT not in", values, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztBetween(Short value1, Short value2) {
            addCriterion("DJZT between", value1, value2, "djzt");
            return (Criteria) this;
        }

        public Criteria andDjztNotBetween(Short value1, Short value2) {
            addCriterion("DJZT not between", value1, value2, "djzt");
            return (Criteria) this;
        }

        public Criteria andCzjbIsNull() {
            addCriterion("CZJB is null");
            return (Criteria) this;
        }

        public Criteria andCzjbIsNotNull() {
            addCriterion("CZJB is not null");
            return (Criteria) this;
        }

        public Criteria andCzjbEqualTo(Short value) {
            addCriterion("CZJB =", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbNotEqualTo(Short value) {
            addCriterion("CZJB <>", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbGreaterThan(Short value) {
            addCriterion("CZJB >", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbGreaterThanOrEqualTo(Short value) {
            addCriterion("CZJB >=", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbLessThan(Short value) {
            addCriterion("CZJB <", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbLessThanOrEqualTo(Short value) {
            addCriterion("CZJB <=", value, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbIn(List<Short> values) {
            addCriterion("CZJB in", values, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbNotIn(List<Short> values) {
            addCriterion("CZJB not in", values, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbBetween(Short value1, Short value2) {
            addCriterion("CZJB between", value1, value2, "czjb");
            return (Criteria) this;
        }

        public Criteria andCzjbNotBetween(Short value1, Short value2) {
            addCriterion("CZJB not between", value1, value2, "czjb");
            return (Criteria) this;
        }

        public Criteria andGhIsNull() {
            addCriterion("GH is null");
            return (Criteria) this;
        }

        public Criteria andGhIsNotNull() {
            addCriterion("GH is not null");
            return (Criteria) this;
        }

        public Criteria andGhEqualTo(String value) {
            addCriterion("GH =", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotEqualTo(String value) {
            addCriterion("GH <>", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThan(String value) {
            addCriterion("GH >", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThanOrEqualTo(String value) {
            addCriterion("GH >=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThan(String value) {
            addCriterion("GH <", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThanOrEqualTo(String value) {
            addCriterion("GH <=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLike(String value) {
            addCriterion("GH like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotLike(String value) {
            addCriterion("GH not like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhIn(List<String> values) {
            addCriterion("GH in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotIn(List<String> values) {
            addCriterion("GH not in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhBetween(String value1, String value2) {
            addCriterion("GH between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotBetween(String value1, String value2) {
            addCriterion("GH not between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andNcIsNull() {
            addCriterion("NC is null");
            return (Criteria) this;
        }

        public Criteria andNcIsNotNull() {
            addCriterion("NC is not null");
            return (Criteria) this;
        }

        public Criteria andNcEqualTo(String value) {
            addCriterion("NC =", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotEqualTo(String value) {
            addCriterion("NC <>", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThan(String value) {
            addCriterion("NC >", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThanOrEqualTo(String value) {
            addCriterion("NC >=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThan(String value) {
            addCriterion("NC <", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThanOrEqualTo(String value) {
            addCriterion("NC <=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLike(String value) {
            addCriterion("NC like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotLike(String value) {
            addCriterion("NC not like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcIn(List<String> values) {
            addCriterion("NC in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotIn(List<String> values) {
            addCriterion("NC not in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcBetween(String value1, String value2) {
            addCriterion("NC between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotBetween(String value1, String value2) {
            addCriterion("NC not between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andYhlxIsNull() {
            addCriterion("YHLX is null");
            return (Criteria) this;
        }

        public Criteria andYhlxIsNotNull() {
            addCriterion("YHLX is not null");
            return (Criteria) this;
        }

        public Criteria andYhlxEqualTo(Short value) {
            addCriterion("YHLX =", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotEqualTo(Short value) {
            addCriterion("YHLX <>", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxGreaterThan(Short value) {
            addCriterion("YHLX >", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxGreaterThanOrEqualTo(Short value) {
            addCriterion("YHLX >=", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxLessThan(Short value) {
            addCriterion("YHLX <", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxLessThanOrEqualTo(Short value) {
            addCriterion("YHLX <=", value, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxIn(List<Short> values) {
            addCriterion("YHLX in", values, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotIn(List<Short> values) {
            addCriterion("YHLX not in", values, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxBetween(Short value1, Short value2) {
            addCriterion("YHLX between", value1, value2, "yhlx");
            return (Criteria) this;
        }

        public Criteria andYhlxNotBetween(Short value1, Short value2) {
            addCriterion("YHLX not between", value1, value2, "yhlx");
            return (Criteria) this;
        }

        public Criteria andZpIsNull() {
            addCriterion("ZP is null");
            return (Criteria) this;
        }

        public Criteria andZpIsNotNull() {
            addCriterion("ZP is not null");
            return (Criteria) this;
        }

        public Criteria andZpEqualTo(String value) {
            addCriterion("ZP =", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotEqualTo(String value) {
            addCriterion("ZP <>", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThan(String value) {
            addCriterion("ZP >", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpGreaterThanOrEqualTo(String value) {
            addCriterion("ZP >=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThan(String value) {
            addCriterion("ZP <", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLessThanOrEqualTo(String value) {
            addCriterion("ZP <=", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpLike(String value) {
            addCriterion("ZP like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotLike(String value) {
            addCriterion("ZP not like", value, "zp");
            return (Criteria) this;
        }

        public Criteria andZpIn(List<String> values) {
            addCriterion("ZP in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotIn(List<String> values) {
            addCriterion("ZP not in", values, "zp");
            return (Criteria) this;
        }

        public Criteria andZpBetween(String value1, String value2) {
            addCriterion("ZP between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andZpNotBetween(String value1, String value2) {
            addCriterion("ZP not between", value1, value2, "zp");
            return (Criteria) this;
        }

        public Criteria andXssxIsNull() {
            addCriterion("XSSX is null");
            return (Criteria) this;
        }

        public Criteria andXssxIsNotNull() {
            addCriterion("XSSX is not null");
            return (Criteria) this;
        }

        public Criteria andXssxEqualTo(Short value) {
            addCriterion("XSSX =", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotEqualTo(Short value) {
            addCriterion("XSSX <>", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxGreaterThan(Short value) {
            addCriterion("XSSX >", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxGreaterThanOrEqualTo(Short value) {
            addCriterion("XSSX >=", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxLessThan(Short value) {
            addCriterion("XSSX <", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxLessThanOrEqualTo(Short value) {
            addCriterion("XSSX <=", value, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxIn(List<Short> values) {
            addCriterion("XSSX in", values, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotIn(List<Short> values) {
            addCriterion("XSSX not in", values, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxBetween(Short value1, Short value2) {
            addCriterion("XSSX between", value1, value2, "xssx");
            return (Criteria) this;
        }

        public Criteria andXssxNotBetween(Short value1, Short value2) {
            addCriterion("XSSX not between", value1, value2, "xssx");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("DEF1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("DEF1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("DEF1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }
    }

    /**
     */
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