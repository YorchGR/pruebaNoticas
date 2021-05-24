create index IX_93175C50 on CIVICA_Foo (field2);
create index IX_E94D4D58 on CIVICA_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3BF949DA on CIVICA_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);