package top.vanbyz.pojo;

import java.util.ArrayList;
import java.util.List;

public class PostTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostTypeExample() {
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

        public Criteria andPostTypeIdIsNull() {
            addCriterion("post_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIsNotNull() {
            addCriterion("post_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdEqualTo(Byte value) {
            addCriterion("post_type_id =", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotEqualTo(Byte value) {
            addCriterion("post_type_id <>", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThan(Byte value) {
            addCriterion("post_type_id >", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("post_type_id >=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThan(Byte value) {
            addCriterion("post_type_id <", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("post_type_id <=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIn(List<Byte> values) {
            addCriterion("post_type_id in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotIn(List<Byte> values) {
            addCriterion("post_type_id not in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("post_type_id between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("post_type_id not between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameIsNull() {
            addCriterion("post_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameIsNotNull() {
            addCriterion("post_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameEqualTo(String value) {
            addCriterion("post_type_name =", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameNotEqualTo(String value) {
            addCriterion("post_type_name <>", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameGreaterThan(String value) {
            addCriterion("post_type_name >", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("post_type_name >=", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameLessThan(String value) {
            addCriterion("post_type_name <", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameLessThanOrEqualTo(String value) {
            addCriterion("post_type_name <=", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameLike(String value) {
            addCriterion("post_type_name like", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameNotLike(String value) {
            addCriterion("post_type_name not like", value, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameIn(List<String> values) {
            addCriterion("post_type_name in", values, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameNotIn(List<String> values) {
            addCriterion("post_type_name not in", values, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameBetween(String value1, String value2) {
            addCriterion("post_type_name between", value1, value2, "postTypeName");
            return (Criteria) this;
        }

        public Criteria andPostTypeNameNotBetween(String value1, String value2) {
            addCriterion("post_type_name not between", value1, value2, "postTypeName");
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