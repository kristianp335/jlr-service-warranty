create table JLR_Warranty (
	uuid_ VARCHAR(75) null,
	jlrWarrantyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	category VARCHAR(75) null,
	period VARCHAR(75) null,
	dealer VARCHAR(75) null,
	partCategory VARCHAR(75) null,
	actualCost INTEGER,
	conCode VARCHAR(75) null,
	percentage INTEGER
);