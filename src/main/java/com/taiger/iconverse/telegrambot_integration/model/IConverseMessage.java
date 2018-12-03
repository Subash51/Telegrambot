package com.taiger.iconverse.telegrambot_integration.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

public class IConverseMessage {

	 // generated by ElasticSearch
    private String id;
    @NotNull
    private String text;
    @NotNull
    private String source;
    @NotNull
    private String cid;
    @NotNull
    private String lang;
    private String handler;
    private String topic;
    private String subtopic;
    private boolean rate;
    private Long enquiry;
    private String enquiryStatus;
    private String state;
    private String area;
    private String channel;
    private String inputType;
    private List<Map<String, String>> options; // text, value
    private List<Map<String, String>> choices; //  text, value
    private List<Map<String, String>> links; // topic, subtopic
    private String value;
    private boolean answered;
    private Date timestamp;
    private boolean main;
    private Long preview;
    private String element;
    private String query;
    private Object payload;
    private String variableType;

    // context, expression and reply are here just for debugging
    // TODO put them somewhere else

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public List<Map<String, String>> getOptions() {
        return options;
    }

    public void setOptions(List<Map<String, String>> options) {
        this.options = options;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Map<String, String>> getLinks() {
        return links;
    }

    public void setLinks(List<Map<String, String>> links) {
        this.links = links;
    }

    public boolean isRate() {
        return rate;
    }

    public void setRate(boolean rate) {
        this.rate = rate;
    }

    public void setCurrentTimestamp() {
        this.timestamp = new Date();
        // Date date= new Date();
        // this.setTimestamp(new Timestamp(date.getTime()).toString());
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(Long enquiry) {
        this.enquiry = enquiry;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + "'" +
                ", source='" + source + "'" +
                ", cid='" + cid + "'" +
                ", lang='" + lang + "'" +
                ", handler='" + handler + "'" +
                ", element='" + element + "'" +
                ", query='" + query + "'" +
                ", topic='" + topic + "'" +
                ", subtopic='" + subtopic + "'" +
                ", area='" + area + "'" +
                ", enquiry='" + enquiry + "'" +
                ", main='" + main + "'" +
                ", preview='" + preview + "'" +
                ", channel='" + channel + "'" +
                ", inputType='" + inputType + "'" +
                ", options='" + options + "'" +
                ", choices='" + choices + "'" +
                ", links='" + links + "'" +
                ", value='" + value + "'" +
                ", timestamp='" + timestamp + "'" +
                ", id='" + id + "'" +
                "}";
    }

    public List<Map<String, String>> getChoices() {
		return choices;
	}

	public void setChoices(List<Map<String, String>> choices) {
		this.choices = choices;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public void setSubtopic(String subtopic) {
        this.subtopic = subtopic;
    }

    /**
     * @return the subtopic
     */
    public String getSubtopic() {
        return subtopic;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public Long getPreview() {
        return preview;
    }

    public void setPreview(Long preview) {
        this.preview = preview;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public String getEnquiryStatus() {
        return enquiryStatus;
    }

    public void setEnquiryStatus(String enquiryStatus) {
        this.enquiryStatus = enquiryStatus;
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }
    
	public IConverseMessage() {
		// TODO Auto-generated constructor stub
	}

}