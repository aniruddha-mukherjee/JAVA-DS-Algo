package com.example.helloworld;

enum GCFDefinitionEnum {
	UA_COUNT(
			"ua_count_upload",
			"publish_table_record",
			"usageanalytics_count"),
	UA_APP_USAGE(
			"ua_app_usage",
			"publish_table_record",
			"ua_app_usage");

	private String category;
	private String point;
	private String event;

	GCFDefinitionEnum(String category, String point, String event) {
		this.category = category;
		this.point = point;
		this.event = event;
	}

	public String getCategory() {
		return category;
	}

	public String getPoint() {
		return point;
	}

	public String getEvent() {
		return event;
	}
}

enum GCFFeatureFlag {
	UA_COUNT(
			GCFDefinition.UA_COUNT,
			GCFDefinitionEnum.UA_COUNT
	),
	UA_APP_USAGE(
			GCFDefinition.UA_APP_USAGE,
			GCFDefinitionEnum.UA_APP_USAGE
	);

	private String table;
	private GCFDefinitionEnum definitionEnum;

	GCFFeatureFlag(String table, GCFDefinitionEnum definitionEnum) {
		this.table = table;
		this.definitionEnum = definitionEnum;
	}

	public String getTable() {
		return table;
	}

	public GCFDefinitionEnum getDefinitionEnum() {
		return definitionEnum;
	}
}

public class GCFDefinition {
	public static final String UA_COUNT = "ua_count";
	public static final String UA_APP_USAGE = "ua_app_usage";

	public static void main(String[] args) {
		for (GCFFeatureFlag flag : GCFFeatureFlag.values()) {
			System.out.println(flag.getDefinitionEnum().getCategory() + "," + flag.getDefinitionEnum().getPoint() + "," + flag.getDefinitionEnum().getEvent());
		}

	}
}
