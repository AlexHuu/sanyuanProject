package edu.uestc.ssmdemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TasktableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TasktableExample() {
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

        public Criteria andTasknoIsNull() {
            addCriterion("taskNo is null");
            return (Criteria) this;
        }

        public Criteria andTasknoIsNotNull() {
            addCriterion("taskNo is not null");
            return (Criteria) this;
        }

        public Criteria andTasknoEqualTo(String value) {
            addCriterion("taskNo =", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoNotEqualTo(String value) {
            addCriterion("taskNo <>", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoGreaterThan(String value) {
            addCriterion("taskNo >", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoGreaterThanOrEqualTo(String value) {
            addCriterion("taskNo >=", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoLessThan(String value) {
            addCriterion("taskNo <", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoLessThanOrEqualTo(String value) {
            addCriterion("taskNo <=", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoLike(String value) {
            addCriterion("taskNo like", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoNotLike(String value) {
            addCriterion("taskNo not like", value, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoIn(List<String> values) {
            addCriterion("taskNo in", values, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoNotIn(List<String> values) {
            addCriterion("taskNo not in", values, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoBetween(String value1, String value2) {
            addCriterion("taskNo between", value1, value2, "taskno");
            return (Criteria) this;
        }

        public Criteria andTasknoNotBetween(String value1, String value2) {
            addCriterion("taskNo not between", value1, value2, "taskno");
            return (Criteria) this;
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

        public Criteria andWorkblanknoIsNull() {
            addCriterion("workblankNo is null");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoIsNotNull() {
            addCriterion("workblankNo is not null");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoEqualTo(String value) {
            addCriterion("workblankNo =", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoNotEqualTo(String value) {
            addCriterion("workblankNo <>", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoGreaterThan(String value) {
            addCriterion("workblankNo >", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoGreaterThanOrEqualTo(String value) {
            addCriterion("workblankNo >=", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoLessThan(String value) {
            addCriterion("workblankNo <", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoLessThanOrEqualTo(String value) {
            addCriterion("workblankNo <=", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoLike(String value) {
            addCriterion("workblankNo like", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoNotLike(String value) {
            addCriterion("workblankNo not like", value, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoIn(List<String> values) {
            addCriterion("workblankNo in", values, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoNotIn(List<String> values) {
            addCriterion("workblankNo not in", values, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoBetween(String value1, String value2) {
            addCriterion("workblankNo between", value1, value2, "workblankno");
            return (Criteria) this;
        }

        public Criteria andWorkblanknoNotBetween(String value1, String value2) {
            addCriterion("workblankNo not between", value1, value2, "workblankno");
            return (Criteria) this;
        }

        public Criteria andDateofproduceIsNull() {
            addCriterion("dateOfProduce is null");
            return (Criteria) this;
        }

        public Criteria andDateofproduceIsNotNull() {
            addCriterion("dateOfProduce is not null");
            return (Criteria) this;
        }

        public Criteria andDateofproduceEqualTo(Date value) {
            addCriterionForJDBCDate("dateOfProduce =", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceNotEqualTo(Date value) {
            addCriterionForJDBCDate("dateOfProduce <>", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceGreaterThan(Date value) {
            addCriterionForJDBCDate("dateOfProduce >", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateOfProduce >=", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceLessThan(Date value) {
            addCriterionForJDBCDate("dateOfProduce <", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateOfProduce <=", value, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceIn(List<Date> values) {
            addCriterionForJDBCDate("dateOfProduce in", values, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceNotIn(List<Date> values) {
            addCriterionForJDBCDate("dateOfProduce not in", values, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateOfProduce between", value1, value2, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andDateofproduceNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateOfProduce not between", value1, value2, "dateofproduce");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("colorName is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("colorName is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("colorName =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("colorName <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("colorName >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("colorName >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("colorName <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("colorName <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("colorName like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("colorName not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("colorName in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("colorName not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("colorName between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("colorName not between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornoIsNull() {
            addCriterion("colorNo is null");
            return (Criteria) this;
        }

        public Criteria andColornoIsNotNull() {
            addCriterion("colorNo is not null");
            return (Criteria) this;
        }

        public Criteria andColornoEqualTo(String value) {
            addCriterion("colorNo =", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotEqualTo(String value) {
            addCriterion("colorNo <>", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThan(String value) {
            addCriterion("colorNo >", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThanOrEqualTo(String value) {
            addCriterion("colorNo >=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThan(String value) {
            addCriterion("colorNo <", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThanOrEqualTo(String value) {
            addCriterion("colorNo <=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLike(String value) {
            addCriterion("colorNo like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotLike(String value) {
            addCriterion("colorNo not like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoIn(List<String> values) {
            addCriterion("colorNo in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotIn(List<String> values) {
            addCriterion("colorNo not in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoBetween(String value1, String value2) {
            addCriterion("colorNo between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotBetween(String value1, String value2) {
            addCriterion("colorNo not between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadLine is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadLine is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("deadLine =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("deadLine <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("deadLine >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("deadLine >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("deadLine <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("deadLine <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("deadLine like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("deadLine not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("deadLine in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("deadLine not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("deadLine between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("deadLine not between", value1, value2, "deadline");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWeightperclothIsNull() {
            addCriterion("weightPerCloth is null");
            return (Criteria) this;
        }

        public Criteria andWeightperclothIsNotNull() {
            addCriterion("weightPerCloth is not null");
            return (Criteria) this;
        }

        public Criteria andWeightperclothEqualTo(String value) {
            addCriterion("weightPerCloth =", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothNotEqualTo(String value) {
            addCriterion("weightPerCloth <>", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothGreaterThan(String value) {
            addCriterion("weightPerCloth >", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothGreaterThanOrEqualTo(String value) {
            addCriterion("weightPerCloth >=", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothLessThan(String value) {
            addCriterion("weightPerCloth <", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothLessThanOrEqualTo(String value) {
            addCriterion("weightPerCloth <=", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothLike(String value) {
            addCriterion("weightPerCloth like", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothNotLike(String value) {
            addCriterion("weightPerCloth not like", value, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothIn(List<String> values) {
            addCriterion("weightPerCloth in", values, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothNotIn(List<String> values) {
            addCriterion("weightPerCloth not in", values, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothBetween(String value1, String value2) {
            addCriterion("weightPerCloth between", value1, value2, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andWeightperclothNotBetween(String value1, String value2) {
            addCriterion("weightPerCloth not between", value1, value2, "weightpercloth");
            return (Criteria) this;
        }

        public Criteria andMouseIsNull() {
            addCriterion("mouse is null");
            return (Criteria) this;
        }

        public Criteria andMouseIsNotNull() {
            addCriterion("mouse is not null");
            return (Criteria) this;
        }

        public Criteria andMouseEqualTo(String value) {
            addCriterion("mouse =", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotEqualTo(String value) {
            addCriterion("mouse <>", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThan(String value) {
            addCriterion("mouse >", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseGreaterThanOrEqualTo(String value) {
            addCriterion("mouse >=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThan(String value) {
            addCriterion("mouse <", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLessThanOrEqualTo(String value) {
            addCriterion("mouse <=", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseLike(String value) {
            addCriterion("mouse like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotLike(String value) {
            addCriterion("mouse not like", value, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseIn(List<String> values) {
            addCriterion("mouse in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotIn(List<String> values) {
            addCriterion("mouse not in", values, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseBetween(String value1, String value2) {
            addCriterion("mouse between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andMouseNotBetween(String value1, String value2) {
            addCriterion("mouse not between", value1, value2, "mouse");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskIsNull() {
            addCriterion("countOfClothOfTask is null");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskIsNotNull() {
            addCriterion("countOfClothOfTask is not null");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskEqualTo(String value) {
            addCriterion("countOfClothOfTask =", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskNotEqualTo(String value) {
            addCriterion("countOfClothOfTask <>", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskGreaterThan(String value) {
            addCriterion("countOfClothOfTask >", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskGreaterThanOrEqualTo(String value) {
            addCriterion("countOfClothOfTask >=", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskLessThan(String value) {
            addCriterion("countOfClothOfTask <", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskLessThanOrEqualTo(String value) {
            addCriterion("countOfClothOfTask <=", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskLike(String value) {
            addCriterion("countOfClothOfTask like", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskNotLike(String value) {
            addCriterion("countOfClothOfTask not like", value, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskIn(List<String> values) {
            addCriterion("countOfClothOfTask in", values, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskNotIn(List<String> values) {
            addCriterion("countOfClothOfTask not in", values, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskBetween(String value1, String value2) {
            addCriterion("countOfClothOfTask between", value1, value2, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andCountofclothoftaskNotBetween(String value1, String value2) {
            addCriterion("countOfClothOfTask not between", value1, value2, "countofclothoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskIsNull() {
            addCriterion("weightOfTask is null");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskIsNotNull() {
            addCriterion("weightOfTask is not null");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskEqualTo(String value) {
            addCriterion("weightOfTask =", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskNotEqualTo(String value) {
            addCriterion("weightOfTask <>", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskGreaterThan(String value) {
            addCriterion("weightOfTask >", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskGreaterThanOrEqualTo(String value) {
            addCriterion("weightOfTask >=", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskLessThan(String value) {
            addCriterion("weightOfTask <", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskLessThanOrEqualTo(String value) {
            addCriterion("weightOfTask <=", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskLike(String value) {
            addCriterion("weightOfTask like", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskNotLike(String value) {
            addCriterion("weightOfTask not like", value, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskIn(List<String> values) {
            addCriterion("weightOfTask in", values, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskNotIn(List<String> values) {
            addCriterion("weightOfTask not in", values, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskBetween(String value1, String value2) {
            addCriterion("weightOfTask between", value1, value2, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightoftaskNotBetween(String value1, String value2) {
            addCriterion("weightOfTask not between", value1, value2, "weightoftask");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorIsNull() {
            addCriterion("weightPerDoor is null");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorIsNotNull() {
            addCriterion("weightPerDoor is not null");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorEqualTo(String value) {
            addCriterion("weightPerDoor =", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorNotEqualTo(String value) {
            addCriterion("weightPerDoor <>", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorGreaterThan(String value) {
            addCriterion("weightPerDoor >", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorGreaterThanOrEqualTo(String value) {
            addCriterion("weightPerDoor >=", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorLessThan(String value) {
            addCriterion("weightPerDoor <", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorLessThanOrEqualTo(String value) {
            addCriterion("weightPerDoor <=", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorLike(String value) {
            addCriterion("weightPerDoor like", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorNotLike(String value) {
            addCriterion("weightPerDoor not like", value, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorIn(List<String> values) {
            addCriterion("weightPerDoor in", values, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorNotIn(List<String> values) {
            addCriterion("weightPerDoor not in", values, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorBetween(String value1, String value2) {
            addCriterion("weightPerDoor between", value1, value2, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andWeightperdoorNotBetween(String value1, String value2) {
            addCriterion("weightPerDoor not between", value1, value2, "weightperdoor");
            return (Criteria) this;
        }

        public Criteria andDyetypeIsNull() {
            addCriterion("dyeType is null");
            return (Criteria) this;
        }

        public Criteria andDyetypeIsNotNull() {
            addCriterion("dyeType is not null");
            return (Criteria) this;
        }

        public Criteria andDyetypeEqualTo(String value) {
            addCriterion("dyeType =", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeNotEqualTo(String value) {
            addCriterion("dyeType <>", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeGreaterThan(String value) {
            addCriterion("dyeType >", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeGreaterThanOrEqualTo(String value) {
            addCriterion("dyeType >=", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeLessThan(String value) {
            addCriterion("dyeType <", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeLessThanOrEqualTo(String value) {
            addCriterion("dyeType <=", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeLike(String value) {
            addCriterion("dyeType like", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeNotLike(String value) {
            addCriterion("dyeType not like", value, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeIn(List<String> values) {
            addCriterion("dyeType in", values, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeNotIn(List<String> values) {
            addCriterion("dyeType not in", values, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeBetween(String value1, String value2) {
            addCriterion("dyeType between", value1, value2, "dyetype");
            return (Criteria) this;
        }

        public Criteria andDyetypeNotBetween(String value1, String value2) {
            addCriterion("dyeType not between", value1, value2, "dyetype");
            return (Criteria) this;
        }

        public Criteria andLightsourceIsNull() {
            addCriterion("lightSource is null");
            return (Criteria) this;
        }

        public Criteria andLightsourceIsNotNull() {
            addCriterion("lightSource is not null");
            return (Criteria) this;
        }

        public Criteria andLightsourceEqualTo(String value) {
            addCriterion("lightSource =", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceNotEqualTo(String value) {
            addCriterion("lightSource <>", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceGreaterThan(String value) {
            addCriterion("lightSource >", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceGreaterThanOrEqualTo(String value) {
            addCriterion("lightSource >=", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceLessThan(String value) {
            addCriterion("lightSource <", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceLessThanOrEqualTo(String value) {
            addCriterion("lightSource <=", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceLike(String value) {
            addCriterion("lightSource like", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceNotLike(String value) {
            addCriterion("lightSource not like", value, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceIn(List<String> values) {
            addCriterion("lightSource in", values, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceNotIn(List<String> values) {
            addCriterion("lightSource not in", values, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceBetween(String value1, String value2) {
            addCriterion("lightSource between", value1, value2, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightsourceNotBetween(String value1, String value2) {
            addCriterion("lightSource not between", value1, value2, "lightsource");
            return (Criteria) this;
        }

        public Criteria andLightfaceIsNull() {
            addCriterion("LightFace is null");
            return (Criteria) this;
        }

        public Criteria andLightfaceIsNotNull() {
            addCriterion("LightFace is not null");
            return (Criteria) this;
        }

        public Criteria andLightfaceEqualTo(String value) {
            addCriterion("LightFace =", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceNotEqualTo(String value) {
            addCriterion("LightFace <>", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceGreaterThan(String value) {
            addCriterion("LightFace >", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceGreaterThanOrEqualTo(String value) {
            addCriterion("LightFace >=", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceLessThan(String value) {
            addCriterion("LightFace <", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceLessThanOrEqualTo(String value) {
            addCriterion("LightFace <=", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceLike(String value) {
            addCriterion("LightFace like", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceNotLike(String value) {
            addCriterion("LightFace not like", value, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceIn(List<String> values) {
            addCriterion("LightFace in", values, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceNotIn(List<String> values) {
            addCriterion("LightFace not in", values, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceBetween(String value1, String value2) {
            addCriterion("LightFace between", value1, value2, "lightface");
            return (Criteria) this;
        }

        public Criteria andLightfaceNotBetween(String value1, String value2) {
            addCriterion("LightFace not between", value1, value2, "lightface");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("PH is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("PH is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Double value) {
            addCriterion("PH =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Double value) {
            addCriterion("PH <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Double value) {
            addCriterion("PH >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Double value) {
            addCriterion("PH >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Double value) {
            addCriterion("PH <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Double value) {
            addCriterion("PH <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Double> values) {
            addCriterion("PH in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Double> values) {
            addCriterion("PH not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Double value1, Double value2) {
            addCriterion("PH between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Double value1, Double value2) {
            addCriterion("PH not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andDeoilIsNull() {
            addCriterion("deoil is null");
            return (Criteria) this;
        }

        public Criteria andDeoilIsNotNull() {
            addCriterion("deoil is not null");
            return (Criteria) this;
        }

        public Criteria andDeoilEqualTo(String value) {
            addCriterion("deoil =", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilNotEqualTo(String value) {
            addCriterion("deoil <>", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilGreaterThan(String value) {
            addCriterion("deoil >", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilGreaterThanOrEqualTo(String value) {
            addCriterion("deoil >=", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilLessThan(String value) {
            addCriterion("deoil <", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilLessThanOrEqualTo(String value) {
            addCriterion("deoil <=", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilLike(String value) {
            addCriterion("deoil like", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilNotLike(String value) {
            addCriterion("deoil not like", value, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilIn(List<String> values) {
            addCriterion("deoil in", values, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilNotIn(List<String> values) {
            addCriterion("deoil not in", values, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilBetween(String value1, String value2) {
            addCriterion("deoil between", value1, value2, "deoil");
            return (Criteria) this;
        }

        public Criteria andDeoilNotBetween(String value1, String value2) {
            addCriterion("deoil not between", value1, value2, "deoil");
            return (Criteria) this;
        }

        public Criteria andFixationIsNull() {
            addCriterion("fixation is null");
            return (Criteria) this;
        }

        public Criteria andFixationIsNotNull() {
            addCriterion("fixation is not null");
            return (Criteria) this;
        }

        public Criteria andFixationEqualTo(String value) {
            addCriterion("fixation =", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationNotEqualTo(String value) {
            addCriterion("fixation <>", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationGreaterThan(String value) {
            addCriterion("fixation >", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationGreaterThanOrEqualTo(String value) {
            addCriterion("fixation >=", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationLessThan(String value) {
            addCriterion("fixation <", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationLessThanOrEqualTo(String value) {
            addCriterion("fixation <=", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationLike(String value) {
            addCriterion("fixation like", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationNotLike(String value) {
            addCriterion("fixation not like", value, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationIn(List<String> values) {
            addCriterion("fixation in", values, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationNotIn(List<String> values) {
            addCriterion("fixation not in", values, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationBetween(String value1, String value2) {
            addCriterion("fixation between", value1, value2, "fixation");
            return (Criteria) this;
        }

        public Criteria andFixationNotBetween(String value1, String value2) {
            addCriterion("fixation not between", value1, value2, "fixation");
            return (Criteria) this;
        }

        public Criteria andPolishIsNull() {
            addCriterion("polish is null");
            return (Criteria) this;
        }

        public Criteria andPolishIsNotNull() {
            addCriterion("polish is not null");
            return (Criteria) this;
        }

        public Criteria andPolishEqualTo(String value) {
            addCriterion("polish =", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishNotEqualTo(String value) {
            addCriterion("polish <>", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishGreaterThan(String value) {
            addCriterion("polish >", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishGreaterThanOrEqualTo(String value) {
            addCriterion("polish >=", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishLessThan(String value) {
            addCriterion("polish <", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishLessThanOrEqualTo(String value) {
            addCriterion("polish <=", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishLike(String value) {
            addCriterion("polish like", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishNotLike(String value) {
            addCriterion("polish not like", value, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishIn(List<String> values) {
            addCriterion("polish in", values, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishNotIn(List<String> values) {
            addCriterion("polish not in", values, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishBetween(String value1, String value2) {
            addCriterion("polish between", value1, value2, "polish");
            return (Criteria) this;
        }

        public Criteria andPolishNotBetween(String value1, String value2) {
            addCriterion("polish not between", value1, value2, "polish");
            return (Criteria) this;
        }

        public Criteria andAberrationIsNull() {
            addCriterion("aberration is null");
            return (Criteria) this;
        }

        public Criteria andAberrationIsNotNull() {
            addCriterion("aberration is not null");
            return (Criteria) this;
        }

        public Criteria andAberrationEqualTo(String value) {
            addCriterion("aberration =", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationNotEqualTo(String value) {
            addCriterion("aberration <>", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationGreaterThan(String value) {
            addCriterion("aberration >", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationGreaterThanOrEqualTo(String value) {
            addCriterion("aberration >=", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationLessThan(String value) {
            addCriterion("aberration <", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationLessThanOrEqualTo(String value) {
            addCriterion("aberration <=", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationLike(String value) {
            addCriterion("aberration like", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationNotLike(String value) {
            addCriterion("aberration not like", value, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationIn(List<String> values) {
            addCriterion("aberration in", values, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationNotIn(List<String> values) {
            addCriterion("aberration not in", values, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationBetween(String value1, String value2) {
            addCriterion("aberration between", value1, value2, "aberration");
            return (Criteria) this;
        }

        public Criteria andAberrationNotBetween(String value1, String value2) {
            addCriterion("aberration not between", value1, value2, "aberration");
            return (Criteria) this;
        }

        public Criteria andDetectionIsNull() {
            addCriterion("detection is null");
            return (Criteria) this;
        }

        public Criteria andDetectionIsNotNull() {
            addCriterion("detection is not null");
            return (Criteria) this;
        }

        public Criteria andDetectionEqualTo(String value) {
            addCriterion("detection =", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotEqualTo(String value) {
            addCriterion("detection <>", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionGreaterThan(String value) {
            addCriterion("detection >", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionGreaterThanOrEqualTo(String value) {
            addCriterion("detection >=", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLessThan(String value) {
            addCriterion("detection <", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLessThanOrEqualTo(String value) {
            addCriterion("detection <=", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLike(String value) {
            addCriterion("detection like", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotLike(String value) {
            addCriterion("detection not like", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionIn(List<String> values) {
            addCriterion("detection in", values, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotIn(List<String> values) {
            addCriterion("detection not in", values, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionBetween(String value1, String value2) {
            addCriterion("detection between", value1, value2, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotBetween(String value1, String value2) {
            addCriterion("detection not between", value1, value2, "detection");
            return (Criteria) this;
        }

        public Criteria andFastnessIsNull() {
            addCriterion("fastness is null");
            return (Criteria) this;
        }

        public Criteria andFastnessIsNotNull() {
            addCriterion("fastness is not null");
            return (Criteria) this;
        }

        public Criteria andFastnessEqualTo(String value) {
            addCriterion("fastness =", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessNotEqualTo(String value) {
            addCriterion("fastness <>", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessGreaterThan(String value) {
            addCriterion("fastness >", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessGreaterThanOrEqualTo(String value) {
            addCriterion("fastness >=", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessLessThan(String value) {
            addCriterion("fastness <", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessLessThanOrEqualTo(String value) {
            addCriterion("fastness <=", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessLike(String value) {
            addCriterion("fastness like", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessNotLike(String value) {
            addCriterion("fastness not like", value, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessIn(List<String> values) {
            addCriterion("fastness in", values, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessNotIn(List<String> values) {
            addCriterion("fastness not in", values, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessBetween(String value1, String value2) {
            addCriterion("fastness between", value1, value2, "fastness");
            return (Criteria) this;
        }

        public Criteria andFastnessNotBetween(String value1, String value2) {
            addCriterion("fastness not between", value1, value2, "fastness");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("application not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andSliceIsNull() {
            addCriterion("slice is null");
            return (Criteria) this;
        }

        public Criteria andSliceIsNotNull() {
            addCriterion("slice is not null");
            return (Criteria) this;
        }

        public Criteria andSliceEqualTo(String value) {
            addCriterion("slice =", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceNotEqualTo(String value) {
            addCriterion("slice <>", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceGreaterThan(String value) {
            addCriterion("slice >", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceGreaterThanOrEqualTo(String value) {
            addCriterion("slice >=", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceLessThan(String value) {
            addCriterion("slice <", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceLessThanOrEqualTo(String value) {
            addCriterion("slice <=", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceLike(String value) {
            addCriterion("slice like", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceNotLike(String value) {
            addCriterion("slice not like", value, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceIn(List<String> values) {
            addCriterion("slice in", values, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceNotIn(List<String> values) {
            addCriterion("slice not in", values, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceBetween(String value1, String value2) {
            addCriterion("slice between", value1, value2, "slice");
            return (Criteria) this;
        }

        public Criteria andSliceNotBetween(String value1, String value2) {
            addCriterion("slice not between", value1, value2, "slice");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andCurstateIsNull() {
            addCriterion("curState is null");
            return (Criteria) this;
        }

        public Criteria andCurstateIsNotNull() {
            addCriterion("curState is not null");
            return (Criteria) this;
        }

        public Criteria andCurstateEqualTo(String value) {
            addCriterion("curState =", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateNotEqualTo(String value) {
            addCriterion("curState <>", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateGreaterThan(String value) {
            addCriterion("curState >", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateGreaterThanOrEqualTo(String value) {
            addCriterion("curState >=", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateLessThan(String value) {
            addCriterion("curState <", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateLessThanOrEqualTo(String value) {
            addCriterion("curState <=", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateLike(String value) {
            addCriterion("curState like", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateNotLike(String value) {
            addCriterion("curState not like", value, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateIn(List<String> values) {
            addCriterion("curState in", values, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateNotIn(List<String> values) {
            addCriterion("curState not in", values, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateBetween(String value1, String value2) {
            addCriterion("curState between", value1, value2, "curstate");
            return (Criteria) this;
        }

        public Criteria andCurstateNotBetween(String value1, String value2) {
            addCriterion("curState not between", value1, value2, "curstate");
            return (Criteria) this;
        }

        public Criteria andNextstateIsNull() {
            addCriterion("nextState is null");
            return (Criteria) this;
        }

        public Criteria andNextstateIsNotNull() {
            addCriterion("nextState is not null");
            return (Criteria) this;
        }

        public Criteria andNextstateEqualTo(String value) {
            addCriterion("nextState =", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateNotEqualTo(String value) {
            addCriterion("nextState <>", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateGreaterThan(String value) {
            addCriterion("nextState >", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateGreaterThanOrEqualTo(String value) {
            addCriterion("nextState >=", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateLessThan(String value) {
            addCriterion("nextState <", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateLessThanOrEqualTo(String value) {
            addCriterion("nextState <=", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateLike(String value) {
            addCriterion("nextState like", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateNotLike(String value) {
            addCriterion("nextState not like", value, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateIn(List<String> values) {
            addCriterion("nextState in", values, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateNotIn(List<String> values) {
            addCriterion("nextState not in", values, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateBetween(String value1, String value2) {
            addCriterion("nextState between", value1, value2, "nextstate");
            return (Criteria) this;
        }

        public Criteria andNextstateNotBetween(String value1, String value2) {
            addCriterion("nextState not between", value1, value2, "nextstate");
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