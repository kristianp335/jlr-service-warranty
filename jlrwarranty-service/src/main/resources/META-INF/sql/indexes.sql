create index IX_A27933A9 on JLR_Warranty (userId, createDate);
create index IX_B63FCDE5 on JLR_Warranty (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2CBC89A7 on JLR_Warranty (uuid_[$COLUMN_LENGTH:75$], groupId);