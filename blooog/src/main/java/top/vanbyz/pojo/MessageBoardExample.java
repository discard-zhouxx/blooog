package top.vanbyz.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageBoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageBoardExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andReviewNameIsNull() {
            addCriterion("review_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewNameIsNotNull() {
            addCriterion("review_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewNameEqualTo(String value) {
            addCriterion("review_name =", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotEqualTo(String value) {
            addCriterion("review_name <>", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameGreaterThan(String value) {
            addCriterion("review_name >", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameGreaterThanOrEqualTo(String value) {
            addCriterion("review_name >=", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLessThan(String value) {
            addCriterion("review_name <", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLessThanOrEqualTo(String value) {
            addCriterion("review_name <=", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameLike(String value) {
            addCriterion("review_name like", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotLike(String value) {
            addCriterion("review_name not like", value, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameIn(List<String> values) {
            addCriterion("review_name in", values, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotIn(List<String> values) {
            addCriterion("review_name not in", values, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameBetween(String value1, String value2) {
            addCriterion("review_name between", value1, value2, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewNameNotBetween(String value1, String value2) {
            addCriterion("review_name not between", value1, value2, "reviewName");
            return (Criteria) this;
        }

        public Criteria andReviewContactIsNull() {
            addCriterion("review_contact is null");
            return (Criteria) this;
        }

        public Criteria andReviewContactIsNotNull() {
            addCriterion("review_contact is not null");
            return (Criteria) this;
        }

        public Criteria andReviewContactEqualTo(String value) {
            addCriterion("review_contact =", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactNotEqualTo(String value) {
            addCriterion("review_contact <>", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactGreaterThan(String value) {
            addCriterion("review_contact >", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactGreaterThanOrEqualTo(String value) {
            addCriterion("review_contact >=", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactLessThan(String value) {
            addCriterion("review_contact <", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactLessThanOrEqualTo(String value) {
            addCriterion("review_contact <=", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactLike(String value) {
            addCriterion("review_contact like", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactNotLike(String value) {
            addCriterion("review_contact not like", value, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactIn(List<String> values) {
            addCriterion("review_contact in", values, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactNotIn(List<String> values) {
            addCriterion("review_contact not in", values, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactBetween(String value1, String value2) {
            addCriterion("review_contact between", value1, value2, "reviewContact");
            return (Criteria) this;
        }

        public Criteria andReviewContactNotBetween(String value1, String value2) {
            addCriterion("review_contact not between", value1, value2, "reviewContact");
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