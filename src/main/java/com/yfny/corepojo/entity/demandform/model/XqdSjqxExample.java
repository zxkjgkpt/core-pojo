package com.yfny.corepojo.entity.demandform.model;

import java.util.ArrayList;
import java.util.List;

public class XqdSjqxExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public XqdSjqxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
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
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
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
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NWIDP.IMP_XQD_SJQX
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
     * This class corresponds to the database table NWIDP.IMP_XQD_SJQX
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

        public Criteria andXxbsIsNull() {
            addCriterion("XXBS is null");
            return (Criteria) this;
        }

        public Criteria andXxbsIsNotNull() {
            addCriterion("XXBS is not null");
            return (Criteria) this;
        }

        public Criteria andXxbsEqualTo(String value) {
            addCriterion("XXBS =", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsNotEqualTo(String value) {
            addCriterion("XXBS <>", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsGreaterThan(String value) {
            addCriterion("XXBS >", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsGreaterThanOrEqualTo(String value) {
            addCriterion("XXBS >=", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsLessThan(String value) {
            addCriterion("XXBS <", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsLessThanOrEqualTo(String value) {
            addCriterion("XXBS <=", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsLike(String value) {
            addCriterion("XXBS like", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsNotLike(String value) {
            addCriterion("XXBS not like", value, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsIn(List<String> values) {
            addCriterion("XXBS in", values, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsNotIn(List<String> values) {
            addCriterion("XXBS not in", values, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsBetween(String value1, String value2) {
            addCriterion("XXBS between", value1, value2, "xxbs");
            return (Criteria) this;
        }

        public Criteria andXxbsNotBetween(String value1, String value2) {
            addCriterion("XXBS not between", value1, value2, "xxbs");
            return (Criteria) this;
        }

        public Criteria andJsbsIsNull() {
            addCriterion("JSBS is null");
            return (Criteria) this;
        }

        public Criteria andJsbsIsNotNull() {
            addCriterion("JSBS is not null");
            return (Criteria) this;
        }

        public Criteria andJsbsEqualTo(String value) {
            addCriterion("JSBS =", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotEqualTo(String value) {
            addCriterion("JSBS <>", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThan(String value) {
            addCriterion("JSBS >", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsGreaterThanOrEqualTo(String value) {
            addCriterion("JSBS >=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThan(String value) {
            addCriterion("JSBS <", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLessThanOrEqualTo(String value) {
            addCriterion("JSBS <=", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsLike(String value) {
            addCriterion("JSBS like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotLike(String value) {
            addCriterion("JSBS not like", value, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsIn(List<String> values) {
            addCriterion("JSBS in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotIn(List<String> values) {
            addCriterion("JSBS not in", values, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsBetween(String value1, String value2) {
            addCriterion("JSBS between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJsbsNotBetween(String value1, String value2) {
            addCriterion("JSBS not between", value1, value2, "jsbs");
            return (Criteria) this;
        }

        public Criteria andJgbsIsNull() {
            addCriterion("JGBS is null");
            return (Criteria) this;
        }

        public Criteria andJgbsIsNotNull() {
            addCriterion("JGBS is not null");
            return (Criteria) this;
        }

        public Criteria andJgbsEqualTo(String value) {
            addCriterion("JGBS =", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsNotEqualTo(String value) {
            addCriterion("JGBS <>", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsGreaterThan(String value) {
            addCriterion("JGBS >", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsGreaterThanOrEqualTo(String value) {
            addCriterion("JGBS >=", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsLessThan(String value) {
            addCriterion("JGBS <", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsLessThanOrEqualTo(String value) {
            addCriterion("JGBS <=", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsLike(String value) {
            addCriterion("JGBS like", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsNotLike(String value) {
            addCriterion("JGBS not like", value, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsIn(List<String> values) {
            addCriterion("JGBS in", values, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsNotIn(List<String> values) {
            addCriterion("JGBS not in", values, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsBetween(String value1, String value2) {
            addCriterion("JGBS between", value1, value2, "jgbs");
            return (Criteria) this;
        }

        public Criteria andJgbsNotBetween(String value1, String value2) {
            addCriterion("JGBS not between", value1, value2, "jgbs");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table NWIDP.IMP_XQD_SJQX
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
     * This class corresponds to the database table NWIDP.IMP_XQD_SJQX
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