package top.vanbyz.pojo;

import java.util.ArrayList;
import java.util.List;

public class BloggerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BloggerExample() {
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

        public Criteria andBloggerNameIsNull() {
            addCriterion("blogger_name is null");
            return (Criteria) this;
        }

        public Criteria andBloggerNameIsNotNull() {
            addCriterion("blogger_name is not null");
            return (Criteria) this;
        }

        public Criteria andBloggerNameEqualTo(String value) {
            addCriterion("blogger_name =", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameNotEqualTo(String value) {
            addCriterion("blogger_name <>", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameGreaterThan(String value) {
            addCriterion("blogger_name >", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameGreaterThanOrEqualTo(String value) {
            addCriterion("blogger_name >=", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameLessThan(String value) {
            addCriterion("blogger_name <", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameLessThanOrEqualTo(String value) {
            addCriterion("blogger_name <=", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameLike(String value) {
            addCriterion("blogger_name like", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameNotLike(String value) {
            addCriterion("blogger_name not like", value, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameIn(List<String> values) {
            addCriterion("blogger_name in", values, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameNotIn(List<String> values) {
            addCriterion("blogger_name not in", values, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameBetween(String value1, String value2) {
            addCriterion("blogger_name between", value1, value2, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerNameNotBetween(String value1, String value2) {
            addCriterion("blogger_name not between", value1, value2, "bloggerName");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordIsNull() {
            addCriterion("blogger_password is null");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordIsNotNull() {
            addCriterion("blogger_password is not null");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordEqualTo(String value) {
            addCriterion("blogger_password =", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordNotEqualTo(String value) {
            addCriterion("blogger_password <>", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordGreaterThan(String value) {
            addCriterion("blogger_password >", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("blogger_password >=", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordLessThan(String value) {
            addCriterion("blogger_password <", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordLessThanOrEqualTo(String value) {
            addCriterion("blogger_password <=", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordLike(String value) {
            addCriterion("blogger_password like", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordNotLike(String value) {
            addCriterion("blogger_password not like", value, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordIn(List<String> values) {
            addCriterion("blogger_password in", values, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordNotIn(List<String> values) {
            addCriterion("blogger_password not in", values, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordBetween(String value1, String value2) {
            addCriterion("blogger_password between", value1, value2, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerPasswordNotBetween(String value1, String value2) {
            addCriterion("blogger_password not between", value1, value2, "bloggerPassword");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressIsNull() {
            addCriterion("blogger_address is null");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressIsNotNull() {
            addCriterion("blogger_address is not null");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressEqualTo(String value) {
            addCriterion("blogger_address =", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressNotEqualTo(String value) {
            addCriterion("blogger_address <>", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressGreaterThan(String value) {
            addCriterion("blogger_address >", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("blogger_address >=", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressLessThan(String value) {
            addCriterion("blogger_address <", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressLessThanOrEqualTo(String value) {
            addCriterion("blogger_address <=", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressLike(String value) {
            addCriterion("blogger_address like", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressNotLike(String value) {
            addCriterion("blogger_address not like", value, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressIn(List<String> values) {
            addCriterion("blogger_address in", values, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressNotIn(List<String> values) {
            addCriterion("blogger_address not in", values, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressBetween(String value1, String value2) {
            addCriterion("blogger_address between", value1, value2, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerAddressNotBetween(String value1, String value2) {
            addCriterion("blogger_address not between", value1, value2, "bloggerAddress");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureIsNull() {
            addCriterion("blogger_signature is null");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureIsNotNull() {
            addCriterion("blogger_signature is not null");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureEqualTo(String value) {
            addCriterion("blogger_signature =", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureNotEqualTo(String value) {
            addCriterion("blogger_signature <>", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureGreaterThan(String value) {
            addCriterion("blogger_signature >", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("blogger_signature >=", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureLessThan(String value) {
            addCriterion("blogger_signature <", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureLessThanOrEqualTo(String value) {
            addCriterion("blogger_signature <=", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureLike(String value) {
            addCriterion("blogger_signature like", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureNotLike(String value) {
            addCriterion("blogger_signature not like", value, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureIn(List<String> values) {
            addCriterion("blogger_signature in", values, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureNotIn(List<String> values) {
            addCriterion("blogger_signature not in", values, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureBetween(String value1, String value2) {
            addCriterion("blogger_signature between", value1, value2, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerSignatureNotBetween(String value1, String value2) {
            addCriterion("blogger_signature not between", value1, value2, "bloggerSignature");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailIsNull() {
            addCriterion("blogger_email is null");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailIsNotNull() {
            addCriterion("blogger_email is not null");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailEqualTo(String value) {
            addCriterion("blogger_email =", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailNotEqualTo(String value) {
            addCriterion("blogger_email <>", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailGreaterThan(String value) {
            addCriterion("blogger_email >", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("blogger_email >=", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailLessThan(String value) {
            addCriterion("blogger_email <", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailLessThanOrEqualTo(String value) {
            addCriterion("blogger_email <=", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailLike(String value) {
            addCriterion("blogger_email like", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailNotLike(String value) {
            addCriterion("blogger_email not like", value, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailIn(List<String> values) {
            addCriterion("blogger_email in", values, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailNotIn(List<String> values) {
            addCriterion("blogger_email not in", values, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailBetween(String value1, String value2) {
            addCriterion("blogger_email between", value1, value2, "bloggerEmail");
            return (Criteria) this;
        }

        public Criteria andBloggerEmailNotBetween(String value1, String value2) {
            addCriterion("blogger_email not between", value1, value2, "bloggerEmail");
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