package org.sakaiproject.evaluation.model;

// Generated Jan 11, 2007 11:02:49 AM by Hibernate Tools 3.2.0.beta6a

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EvalEvaluation generated by hbm2java
 */
public class EvalEvaluation implements java.io.Serializable {

	// Fields    

	private Long id;

	private Date lastModified;

	private String owner;

	private String title;

	private String instructions;

	private Date startDate;

	private Date stopDate;

	private Date dueDate;

	private Date viewDate;

	private Date studentsDate;

	private Date instructorsDate;

	private String state;

	private String instructorOpt;

	private Integer reminderDays;

	private String reminderFromEmail;

	private String termId;

	private EvalEmailTemplate availableEmailTemplate;

	private EvalEmailTemplate reminderEmailTemplate;

	private EvalTemplate template;

	private Set responses = new HashSet(0);

	private Boolean resultsPrivate;

	private Boolean blankResponsesAllowed;

	private Boolean modifyResponsesAllowed;

	private Boolean unregisteredAllowed;

	private Boolean locked;

	// Constructors

	/** default constructor */
	public EvalEvaluation() {
	}

	/** minimal constructor */
	public EvalEvaluation(Date lastModified, String owner, String title, Date startDate, Date stopDate, Date dueDate,
			Date viewDate, String state, String instructorOpt, Integer reminderDays, EvalTemplate template) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.title = title;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.dueDate = dueDate;
		this.viewDate = viewDate;
		this.state = state;
		this.instructorOpt = instructorOpt;
		this.reminderDays = reminderDays;
		this.template = template;
	}

	/** full constructor */
	public EvalEvaluation(Date lastModified, String owner, String title, String instructions, Date startDate,
			Date stopDate, Date dueDate, Date viewDate, Date studentsDate, Date instructorsDate, String state,
			String instructorOpt, Integer reminderDays, String reminderFromEmail, String termId,
			EvalEmailTemplate availableEmailTemplate, EvalEmailTemplate reminderEmailTemplate, EvalTemplate template,
			Set responses, Boolean resultsPrivate, Boolean blankResponsesAllowed, Boolean modifyResponsesAllowed,
			Boolean unregisteredAllowed, Boolean locked) {
		this.lastModified = lastModified;
		this.owner = owner;
		this.title = title;
		this.instructions = instructions;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.dueDate = dueDate;
		this.viewDate = viewDate;
		this.studentsDate = studentsDate;
		this.instructorsDate = instructorsDate;
		this.state = state;
		this.instructorOpt = instructorOpt;
		this.reminderDays = reminderDays;
		this.reminderFromEmail = reminderFromEmail;
		this.termId = termId;
		this.availableEmailTemplate = availableEmailTemplate;
		this.reminderEmailTemplate = reminderEmailTemplate;
		this.template = template;
		this.responses = responses;
		this.resultsPrivate = resultsPrivate;
		this.blankResponsesAllowed = blankResponsesAllowed;
		this.modifyResponsesAllowed = modifyResponsesAllowed;
		this.unregisteredAllowed = unregisteredAllowed;
		this.locked = locked;
	}

	// Property accessors
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructions() {
		return this.instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStopDate() {
		return this.stopDate;
	}

	public void setStopDate(Date stopDate) {
		this.stopDate = stopDate;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getViewDate() {
		return this.viewDate;
	}

	public void setViewDate(Date viewDate) {
		this.viewDate = viewDate;
	}

	public Date getStudentsDate() {
		return this.studentsDate;
	}

	public void setStudentsDate(Date studentsDate) {
		this.studentsDate = studentsDate;
	}

	public Date getInstructorsDate() {
		return this.instructorsDate;
	}

	public void setInstructorsDate(Date instructorsDate) {
		this.instructorsDate = instructorsDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInstructorOpt() {
		return this.instructorOpt;
	}

	public void setInstructorOpt(String instructorOpt) {
		this.instructorOpt = instructorOpt;
	}

	public Integer getReminderDays() {
		return this.reminderDays;
	}

	public void setReminderDays(Integer reminderDays) {
		this.reminderDays = reminderDays;
	}

	public String getReminderFromEmail() {
		return this.reminderFromEmail;
	}

	public void setReminderFromEmail(String reminderFromEmail) {
		this.reminderFromEmail = reminderFromEmail;
	}

	public String getTermId() {
		return this.termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public EvalEmailTemplate getAvailableEmailTemplate() {
		return this.availableEmailTemplate;
	}

	public void setAvailableEmailTemplate(EvalEmailTemplate availableEmailTemplate) {
		this.availableEmailTemplate = availableEmailTemplate;
	}

	public EvalEmailTemplate getReminderEmailTemplate() {
		return this.reminderEmailTemplate;
	}

	public void setReminderEmailTemplate(EvalEmailTemplate reminderEmailTemplate) {
		this.reminderEmailTemplate = reminderEmailTemplate;
	}

	public EvalTemplate getTemplate() {
		return this.template;
	}

	public void setTemplate(EvalTemplate template) {
		this.template = template;
	}

	public Set getResponses() {
		return this.responses;
	}

	public void setResponses(Set responses) {
		this.responses = responses;
	}

	public Boolean getResultsPrivate() {
		return this.resultsPrivate;
	}

	public void setResultsPrivate(Boolean resultsPrivate) {
		this.resultsPrivate = resultsPrivate;
	}

	public Boolean getBlankResponsesAllowed() {
		return this.blankResponsesAllowed;
	}

	public void setBlankResponsesAllowed(Boolean blankResponsesAllowed) {
		this.blankResponsesAllowed = blankResponsesAllowed;
	}

	public Boolean getModifyResponsesAllowed() {
		return this.modifyResponsesAllowed;
	}

	public void setModifyResponsesAllowed(Boolean modifyResponsesAllowed) {
		this.modifyResponsesAllowed = modifyResponsesAllowed;
	}

	public Boolean getUnregisteredAllowed() {
		return this.unregisteredAllowed;
	}

	public void setUnregisteredAllowed(Boolean unregisteredAllowed) {
		this.unregisteredAllowed = unregisteredAllowed;
	}

	public Boolean getLocked() {
		return this.locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

}
