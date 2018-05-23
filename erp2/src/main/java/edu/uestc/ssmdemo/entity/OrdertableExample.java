package edu.uestc.ssmdemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdertableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdertableExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCountofclothIsNull() {
            addCriterion("countOfCloth is null");
            return (Criteria) this;
        }

        public Criteria andCountofclothIsNotNull() {
            addCriterion("countOfCloth is not null");
            return (Criteria) this;
        }

        public Criteria andCountofclothEqualTo(Double value) {
            addCriterion("countOfCloth =", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothNotEqualTo(Double value) {
            addCriterion("countOfCloth <>", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothGreaterThan(Double value) {
            addCriterion("countOfCloth >", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothGreaterThanOrEqualTo(Double value) {
            addCriterion("countOfCloth >=", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothLessThan(Double value) {
            addCriterion("countOfCloth <", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothLessThanOrEqualTo(Double value) {
            addCriterion("countOfCloth <=", value, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothIn(List<Double> values) {
            addCriterion("countOfCloth in", values, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothNotIn(List<Double> values) {
            addCriterion("countOfCloth not in", values, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothBetween(Double value1, Double value2) {
            addCriterion("countOfCloth between", value1, value2, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andCountofclothNotBetween(Double value1, Double value2) {
            addCriterion("countOfCloth not between", value1, value2, "countofcloth");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUncompletedIsNull() {
            addCriterion("uncompleted is null");
            return (Criteria) this;
        }

        public Criteria andUncompletedIsNotNull() {
            addCriterion("uncompleted is not null");
            return (Criteria) this;
        }

        public Criteria andUncompletedEqualTo(Double value) {
            addCriterion("uncompleted =", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedNotEqualTo(Double value) {
            addCriterion("uncompleted <>", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedGreaterThan(Double value) {
            addCriterion("uncompleted >", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedGreaterThanOrEqualTo(Double value) {
            addCriterion("uncompleted >=", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedLessThan(Double value) {
            addCriterion("uncompleted <", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedLessThanOrEqualTo(Double value) {
            addCriterion("uncompleted <=", value, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedIn(List<Double> values) {
            addCriterion("uncompleted in", values, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedNotIn(List<Double> values) {
            addCriterion("uncompleted not in", values, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedBetween(Double value1, Double value2) {
            addCriterion("uncompleted between", value1, value2, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andUncompletedNotBetween(Double value1, Double value2) {
            addCriterion("uncompleted not between", value1, value2, "uncompleted");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeIsNull() {
            addCriterion("remarkOfType is null");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeIsNotNull() {
            addCriterion("remarkOfType is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeEqualTo(String value) {
            addCriterion("remarkOfType =", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeNotEqualTo(String value) {
            addCriterion("remarkOfType <>", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeGreaterThan(String value) {
            addCriterion("remarkOfType >", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeGreaterThanOrEqualTo(String value) {
            addCriterion("remarkOfType >=", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeLessThan(String value) {
            addCriterion("remarkOfType <", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeLessThanOrEqualTo(String value) {
            addCriterion("remarkOfType <=", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeLike(String value) {
            addCriterion("remarkOfType like", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeNotLike(String value) {
            addCriterion("remarkOfType not like", value, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeIn(List<String> values) {
            addCriterion("remarkOfType in", values, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeNotIn(List<String> values) {
            addCriterion("remarkOfType not in", values, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeBetween(String value1, String value2) {
            addCriterion("remarkOfType between", value1, value2, "remarkoftype");
            return (Criteria) this;
        }

        public Criteria andRemarkoftypeNotBetween(String value1, String value2) {
            addCriterion("remarkOfType not between", value1, value2, "remarkoftype");
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