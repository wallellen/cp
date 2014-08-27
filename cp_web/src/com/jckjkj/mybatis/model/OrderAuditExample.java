package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderAuditExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andAoopinionIsNull() {
            addCriterion("aoopinion is null");
            return (Criteria) this;
        }

        public Criteria andAoopinionIsNotNull() {
            addCriterion("aoopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAoopinionEqualTo(String value) {
            addCriterion("aoopinion =", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotEqualTo(String value) {
            addCriterion("aoopinion <>", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionGreaterThan(String value) {
            addCriterion("aoopinion >", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionGreaterThanOrEqualTo(String value) {
            addCriterion("aoopinion >=", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLessThan(String value) {
            addCriterion("aoopinion <", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLessThanOrEqualTo(String value) {
            addCriterion("aoopinion <=", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLike(String value) {
            addCriterion("aoopinion like", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotLike(String value) {
            addCriterion("aoopinion not like", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionIn(List<String> values) {
            addCriterion("aoopinion in", values, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotIn(List<String> values) {
            addCriterion("aoopinion not in", values, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionBetween(String value1, String value2) {
            addCriterion("aoopinion between", value1, value2, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotBetween(String value1, String value2) {
            addCriterion("aoopinion not between", value1, value2, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAodateIsNull() {
            addCriterion("aodate is null");
            return (Criteria) this;
        }

        public Criteria andAodateIsNotNull() {
            addCriterion("aodate is not null");
            return (Criteria) this;
        }

        public Criteria andAodateEqualTo(Date value) {
            addCriterion("aodate =", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotEqualTo(Date value) {
            addCriterion("aodate <>", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateGreaterThan(Date value) {
            addCriterion("aodate >", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateGreaterThanOrEqualTo(Date value) {
            addCriterion("aodate >=", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateLessThan(Date value) {
            addCriterion("aodate <", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateLessThanOrEqualTo(Date value) {
            addCriterion("aodate <=", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateIn(List<Date> values) {
            addCriterion("aodate in", values, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotIn(List<Date> values) {
            addCriterion("aodate not in", values, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateBetween(Date value1, Date value2) {
            addCriterion("aodate between", value1, value2, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotBetween(Date value1, Date value2) {
            addCriterion("aodate not between", value1, value2, "aodate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNull() {
            addCriterion("completedate is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNotNull() {
            addCriterion("completedate is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateEqualTo(Date value) {
            addCriterion("completedate =", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotEqualTo(Date value) {
            addCriterion("completedate <>", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThan(Date value) {
            addCriterion("completedate >", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThanOrEqualTo(Date value) {
            addCriterion("completedate >=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThan(Date value) {
            addCriterion("completedate <", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThanOrEqualTo(Date value) {
            addCriterion("completedate <=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIn(List<Date> values) {
            addCriterion("completedate in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotIn(List<Date> values) {
            addCriterion("completedate not in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateBetween(Date value1, Date value2) {
            addCriterion("completedate between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotBetween(Date value1, Date value2) {
            addCriterion("completedate not between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andRepairresultIsNull() {
            addCriterion("repairresult is null");
            return (Criteria) this;
        }

        public Criteria andRepairresultIsNotNull() {
            addCriterion("repairresult is not null");
            return (Criteria) this;
        }

        public Criteria andRepairresultEqualTo(String value) {
            addCriterion("repairresult =", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotEqualTo(String value) {
            addCriterion("repairresult <>", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultGreaterThan(String value) {
            addCriterion("repairresult >", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultGreaterThanOrEqualTo(String value) {
            addCriterion("repairresult >=", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultLessThan(String value) {
            addCriterion("repairresult <", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultLessThanOrEqualTo(String value) {
            addCriterion("repairresult <=", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultLike(String value) {
            addCriterion("repairresult like", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotLike(String value) {
            addCriterion("repairresult not like", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultIn(List<String> values) {
            addCriterion("repairresult in", values, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotIn(List<String> values) {
            addCriterion("repairresult not in", values, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultBetween(String value1, String value2) {
            addCriterion("repairresult between", value1, value2, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotBetween(String value1, String value2) {
            addCriterion("repairresult not between", value1, value2, "repairresult");
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