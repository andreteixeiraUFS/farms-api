package br.ufs.dcomp.farms.common.message;

import java.util.HashMap;
import java.util.Map;

import br.ufs.dcomp.farms.model.enums.MessageEnum;

public final class SuccessMessage extends Message {
	
	private Map<Integer, String> messageMap = new HashMap<Integer, String>();

	public SuccessMessage(Integer code, String description) {
		super(MessageEnum.SUCCESS, code, description);
		messageMap.put(code, description); // TODO For validity in tests.
	}
	
	private static final Integer RESEARCHER_LOGGED_CODE = 1000;
	private static final String RESEARCHER_LOGGED_DESCRIPTION = "Researcher logged successfully.";
	public static final SuccessMessage RESEARCHER_LOGGED = new SuccessMessage(RESEARCHER_LOGGED_CODE, RESEARCHER_LOGGED_DESCRIPTION);
	
	private static final Integer PASSWORD_CHANGED_CODE = 1001;
	private static final String PASSWORD_CHANGED_DESCRIPTION = "Password changed successfully.";
	public static final SuccessMessage PASSWORD_CHANGED = new SuccessMessage(PASSWORD_CHANGED_CODE, PASSWORD_CHANGED_DESCRIPTION);
	
	private static final Integer RESEARCHER_REGISTERED_CODE = 1002;
	private static final String RESEARCHER_REGISTERED_DESCRIPTION = "Researcher registered successfully.";
	public static final SuccessMessage RESEARCHER_REGISTERED = new SuccessMessage(RESEARCHER_REGISTERED_CODE, RESEARCHER_REGISTERED_DESCRIPTION);
	
	private static final Integer RESEARCHER_UPDATED_CODE = 1003;
	private static final String RESEARCHER_UPDATED_DESCRIPTION = "Researcher updated successfully.";
	public static final SuccessMessage RESEARCHER_UPDATED = new SuccessMessage(RESEARCHER_UPDATED_CODE, RESEARCHER_UPDATED_DESCRIPTION);
	
	private static final Integer RESEARCHER_EXCLUDED_CODE = 1004;
	private static final String RESEARCHER_EXCLUDED_DESCRIPTION = "Researcher excluded successfully.";
	public static final SuccessMessage RESEARCHER_EXCLUDED = new SuccessMessage(RESEARCHER_EXCLUDED_CODE, RESEARCHER_EXCLUDED_DESCRIPTION);
	
	private static final Integer ACCOUNT_CONFIRMED_CODE = 1005;
	private static final String ACCOUNT_CONFIRMED_DESCRIPTION = "Account confirmed successfully.";
	public static final SuccessMessage ACCOUNT_CONFIRMED = new SuccessMessage(ACCOUNT_CONFIRMED_CODE, ACCOUNT_CONFIRMED_DESCRIPTION);
	
	private static final Integer PROJECT_REGISTERED_CODE = 1006;
	private static final String PROJECT_REGISTERED_DESCRIPTION = "Project saved successfully.";
	public static final SuccessMessage PROJECT_REGISTERED = new SuccessMessage(PROJECT_REGISTERED_CODE, PROJECT_REGISTERED_DESCRIPTION);
	
	private static final Integer PROJECT_UPDATED_CODE = 1007;
	private static final String PROJECT_UPDATED_DESCRIPTION = "Project updated successfully.";
	public static final SuccessMessage PROJECT_UPDATED = new SuccessMessage(PROJECT_UPDATED_CODE, PROJECT_UPDATED_DESCRIPTION);
	
	private static final Integer INSTITUTION_REGISTERED_CODE = 1008;
	private static final String INSTITUTION_REGISTERED_DESCRIPTION = "Institution saved successfully.";
	public static final SuccessMessage INSTITUTION_REGISTERED = new SuccessMessage(INSTITUTION_REGISTERED_CODE, INSTITUTION_REGISTERED_DESCRIPTION);
	
	private static final Integer INSTITUTION_ADDED_CODE = 1009;
	private static final String INSTITUTION_ADDED_DESCRIPTION = "Institution added successfully.";
	public static final SuccessMessage INSTITUTION_ADDED = new SuccessMessage(INSTITUTION_ADDED_CODE, INSTITUTION_ADDED_DESCRIPTION);
	
	private static final Integer MEMBER_ADDED_CODE = 1010;
	private static final String MEMBER_ADDED_DESCRIPTION = "Member added successfully.";
	public static final SuccessMessage MEMBER_ADDED = new SuccessMessage(MEMBER_ADDED_CODE, MEMBER_ADDED_DESCRIPTION);
	
	
	private static final Integer OBJECTIVE_SAVED_CODE = 1011;
	private static final String OBJECTIVE_SAVED_DESCRIPTION = "Objective saved successfully.";
	public static final SuccessMessage OBJECTIVE_SAVED = new SuccessMessage(OBJECTIVE_SAVED_CODE, OBJECTIVE_SAVED_DESCRIPTION);
	
	private static final Integer MAIN_QUESTION_SAVED_CODE = 1012;
	private static final String MAIN_QUESTION_DESCRIPTION = "Main Question saved successfully.";
	public static final SuccessMessage MAIN_QUESTION_SAVED = new SuccessMessage(MAIN_QUESTION_SAVED_CODE, MAIN_QUESTION_DESCRIPTION);
	
	private static final Integer SECONDARY_QUESTION_SAVED_CODE = 1013;
	private static final String SECONDARY_QUESTION_DESCRIPTION = "Secondary Question saved successfully.";
	public static final SuccessMessage SECONDARY_QUESTION_SAVED = new SuccessMessage(SECONDARY_QUESTION_SAVED_CODE, SECONDARY_QUESTION_DESCRIPTION);
	
	private static final Integer STANDARD_QUERY_SAVED_CODE = 1014;
	private static final String STANDARD_QUERY_SAVED_DESCRIPTION = "Standard Query saved successfully.";
	public static final SuccessMessage STANDARD_QUERY_SAVED = new SuccessMessage(STANDARD_QUERY_SAVED_CODE, STANDARD_QUERY_SAVED_DESCRIPTION);
	
	private static final Integer KEYWORD_SAVED_CODE = 1015;
	private static final String KEYWORD_SAVED_DESCRIPTION = "Keyword saved successfully.";
	public static final SuccessMessage KEYWORD_SAVED = new SuccessMessage(KEYWORD_SAVED_CODE, KEYWORD_SAVED_DESCRIPTION);
	
	private static final Integer CRITERIA_SAVED_CODE = 1016;
	private static final String CRITERIA_SAVED_DESCRIPTION = "Criteria saved successfully.";
	public static final SuccessMessage CRITERIA_SAVED = new SuccessMessage(CRITERIA_SAVED_CODE, CRITERIA_SAVED_DESCRIPTION);
	
	private static final Integer LANGUAGE_ADDED_CODE = 1017;
	private static final String LANGUAGE_ADDED_DESCRIPTION = "Language added successfully.";
	public static final SuccessMessage LANGUAGE_ADDED = new SuccessMessage(LANGUAGE_ADDED_CODE, LANGUAGE_ADDED_DESCRIPTION);
	
	private static final Integer ENGINE_ADDED_CODE = 1018;
	private static final String ENGINE_ADDED_DESCRIPTION = "Engine added successfully.";
	public static final SuccessMessage ENGINE_ADDED = new SuccessMessage(ENGINE_ADDED_CODE, ENGINE_ADDED_DESCRIPTION);
	
	private static final Integer ENGINE_CREATED_CODE = 1019;
	private static final String ENGINE_CREATED_DESCRIPTION = "Engine created successfully.";
	public static final SuccessMessage ENGINE_CREATED= new SuccessMessage(ENGINE_CREATED_CODE, ENGINE_CREATED_DESCRIPTION);
	
	private static final Integer INSTITUTION_UPDATED_CODE = 1020;
	private static final String INSTITUTION_UPDATED_DESCRIPTION = "Institution updated successfully.";
	public static final SuccessMessage INSTITUTION_UPDATED = new SuccessMessage(INSTITUTION_UPDATED_CODE, INSTITUTION_UPDATED_DESCRIPTION);
	
	private static final Integer KEYWORD_DELETED_CODE = 1021;
	private static final String KEYWORD_DELETED_DESCRIPTION = "Keyword deleted successfully.";
	public static final SuccessMessage KEYWORD_DELETED = new SuccessMessage(KEYWORD_DELETED_CODE, KEYWORD_DELETED_DESCRIPTION);
	
	private static final Integer LANGUAGE_DELETED_CODE = 1022;
	private static final String LANGUAGE_DELETED_DESCRIPTION = "Language deleted successfully.";
	public static final SuccessMessage LANGUAGE_DELETED = new SuccessMessage(LANGUAGE_DELETED_CODE, LANGUAGE_DELETED_DESCRIPTION);
	
	private static final Integer ENGINE_DELETED_CODE = 1023;
	private static final String ENGINE_DELETED_DESCRIPTION = "Search engine deleted successfully.";
	public static final SuccessMessage ENGINE_DELETED = new SuccessMessage(ENGINE_DELETED_CODE, ENGINE_DELETED_DESCRIPTION);
	
	private static final Integer CRITERIA_DELETED_CODE = 1024;
	private static final String CRITERIA_DELETED_DESCRIPTION = "Criteria deleted successfully.";
	public static final SuccessMessage CRITERIA_DELETED = new SuccessMessage(CRITERIA_DELETED_CODE, CRITERIA_DELETED_DESCRIPTION);
}