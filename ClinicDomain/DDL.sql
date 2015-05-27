--<ScriptOptions statementTerminator=";"/>

CREATE TABLE pg_range (
		rngtypid OID NOT NULL,
		rngsubtype OID NOT NULL,
		rngcollation OID NOT NULL,
		rngsubopc OID NOT NULL,
		rngcanonical REGPROC NOT NULL,
		rngsubdiff REGPROC NOT NULL
	);

CREATE TABLE drugtreatment (
		id INT8 NOT NULL,
		dosage FLOAT8,
		drug VARCHAR(255)
	);

CREATE TABLE pg_shdepend (
		dbid OID NOT NULL,
		classid OID NOT NULL,
		objid OID NOT NULL,
		objsubid INT4 NOT NULL,
		refclassid OID NOT NULL,
		refobjid OID NOT NULL,
		deptype BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_conversion (
		conname CIDR(2147483647) NOT NULL,
		connamespace OID NOT NULL,
		conowner OID NOT NULL,
		conforencoding INT4 NOT NULL,
		contoencoding INT4 NOT NULL,
		conproc REGPROC NOT NULL,
		condefault BOOL NOT NULL
	);

CREATE TABLE pg_default_acl (
		defaclrole OID NOT NULL,
		defaclnamespace OID NOT NULL,
		defaclobjtype BPCHAR(1) NOT NULL,
		defaclacl ACLITEM[ ]
	);

CREATE TABLE pg_opclass (
		opcmethod OID NOT NULL,
		opcname CIDR(2147483647) NOT NULL,
		opcnamespace OID NOT NULL,
		opcowner OID NOT NULL,
		opcfamily OID NOT NULL,
		opcintype OID NOT NULL,
		opcdefault BOOL NOT NULL,
		opckeytype OID NOT NULL
	);

CREATE TABLE pg_largeobject (
		loid OID NOT NULL,
		pageno INT4 NOT NULL,
		data BYTEA(2147483647)
	);

CREATE TABLE pg_rewrite (
		rulename CIDR(2147483647) NOT NULL,
		ev_class OID NOT NULL,
		ev_attr INT2 NOT NULL,
		ev_type BPCHAR(1) NOT NULL,
		ev_enabled BPCHAR(1) NOT NULL,
		is_instead BOOL NOT NULL,
		ev_qual null,
		ev_action null
	);

CREATE TABLE pg_foreign_table (
		ftrelid OID NOT NULL,
		ftserver OID NOT NULL,
		ftoptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_constraint (
		conname CIDR(2147483647) NOT NULL,
		connamespace OID NOT NULL,
		contype BPCHAR(1) NOT NULL,
		condeferrable BOOL NOT NULL,
		condeferred BOOL NOT NULL,
		convalidated BOOL NOT NULL,
		conrelid OID NOT NULL,
		contypid OID NOT NULL,
		conindid OID NOT NULL,
		confrelid OID NOT NULL,
		confupdtype BPCHAR(1) NOT NULL,
		confdeltype BPCHAR(1) NOT NULL,
		confmatchtype BPCHAR(1) NOT NULL,
		conislocal BOOL NOT NULL,
		coninhcount INT4 NOT NULL,
		connoinherit BOOL NOT NULL,
		conkey INT2[ ],
		confkey INT2[ ],
		conpfeqop OID[ ],
		conppeqop OID[ ],
		conffeqop OID[ ],
		conexclop OID[ ],
		conbin null,
		consrc TEXT(2147483647)
	);

CREATE TABLE surgeonprovider (
		id INT8 NOT NULL
	);

CREATE TABLE pg_type (
		typname CIDR(2147483647) NOT NULL,
		typnamespace OID NOT NULL,
		typowner OID NOT NULL,
		typlen INT2 NOT NULL,
		typbyval BOOL NOT NULL,
		typtype BPCHAR(1) NOT NULL,
		typcategory BPCHAR(1) NOT NULL,
		typispreferred BOOL NOT NULL,
		typisdefined BOOL NOT NULL,
		typdelim BPCHAR(1) NOT NULL,
		typrelid OID NOT NULL,
		typelem OID NOT NULL,
		typarray OID NOT NULL,
		typinput REGPROC NOT NULL,
		typoutput REGPROC NOT NULL,
		typreceive REGPROC NOT NULL,
		typsend REGPROC NOT NULL,
		typmodin REGPROC NOT NULL,
		typmodout REGPROC NOT NULL,
		typanalyze REGPROC NOT NULL,
		typalign BPCHAR(1) NOT NULL,
		typstorage BPCHAR(1) NOT NULL,
		typnotnull BOOL NOT NULL,
		typbasetype OID NOT NULL,
		typtypmod INT4 NOT NULL,
		typndims INT4 NOT NULL,
		typcollation OID NOT NULL,
		typdefaultbin null,
		typdefault TEXT(2147483647),
		typacl ACLITEM[ ]
	);

CREATE TABLE pg_auth_members (
		roleid OID NOT NULL,
		member OID NOT NULL,
		grantor OID NOT NULL,
		admin_option BOOL NOT NULL
	);

CREATE TABLE pg_inherits (
		inhrelid OID NOT NULL,
		inhparent OID NOT NULL,
		inhseqno INT4 NOT NULL
	);

CREATE TABLE treatment (
		id INT8 NOT NULL,
		ttype VARCHAR(31),
		diagnosis VARCHAR(255),
		patient_fk INT8,
		provider_fk INT8
	);

CREATE TABLE pg_amop (
		amopfamily OID NOT NULL,
		amoplefttype OID NOT NULL,
		amoprighttype OID NOT NULL,
		amopstrategy INT2 NOT NULL,
		amoppurpose BPCHAR(1) NOT NULL,
		amopopr OID NOT NULL,
		amopmethod OID NOT NULL,
		amopsortfamily OID NOT NULL
	);

CREATE TABLE pg_default_acl (
		defaclrole OID NOT NULL,
		defaclnamespace OID NOT NULL,
		defaclobjtype BPCHAR(1) NOT NULL,
		defaclacl ACLITEM[ ]
	);

CREATE TABLE patient (
		id INT8 NOT NULL,
		birthdate DATE,
		name VARCHAR(255),
		patientid INT8
	);

CREATE TABLE pg_foreign_data_wrapper (
		fdwname CIDR(2147483647) NOT NULL,
		fdwowner OID NOT NULL,
		fdwhandler OID NOT NULL,
		fdwvalidator OID NOT NULL,
		fdwacl ACLITEM[ ],
		fdwoptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_amproc (
		amprocfamily OID NOT NULL,
		amproclefttype OID NOT NULL,
		amprocrighttype OID NOT NULL,
		amprocnum INT2 NOT NULL,
		amproc REGPROC NOT NULL
	);

CREATE TABLE pg_extension (
		extname CIDR(2147483647) NOT NULL,
		extowner OID NOT NULL,
		extnamespace OID NOT NULL,
		extrelocatable BOOL NOT NULL,
		extversion TEXT(2147483647),
		extconfig OID[ ],
		extcondition TEXT[ ](2147483647)
	);

CREATE TABLE pg_event_trigger (
		evtname CIDR(2147483647) NOT NULL,
		evtevent CIDR(2147483647) NOT NULL,
		evtowner OID NOT NULL,
		evtfoid OID NOT NULL,
		evtenabled BPCHAR(1) NOT NULL,
		evttags TEXT[ ](2147483647)
	);

CREATE TABLE pg_cast (
		castsource OID NOT NULL,
		casttarget OID NOT NULL,
		castfunc OID NOT NULL,
		castcontext BPCHAR(1) NOT NULL,
		castmethod BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_ts_config_map (
		mapcfg OID NOT NULL,
		maptokentype INT4 NOT NULL,
		mapseqno INT4 NOT NULL,
		mapdict OID NOT NULL
	);

CREATE TABLE pg_description (
		objoid OID NOT NULL,
		classoid OID NOT NULL,
		objsubid INT4 NOT NULL,
		description TEXT(2147483647)
	);

CREATE TABLE pg_attrdef (
		adrelid OID NOT NULL,
		adnum INT2 NOT NULL,
		adbin null,
		adsrc TEXT(2147483647)
	);

CREATE TABLE pg_aggregate (
		aggfnoid REGPROC NOT NULL,
		aggtransfn REGPROC NOT NULL,
		aggfinalfn REGPROC NOT NULL,
		aggsortop OID NOT NULL,
		aggtranstype OID NOT NULL,
		agginitval TEXT(2147483647)
	);

CREATE TABLE pg_user_mapping (
		umuser OID NOT NULL,
		umserver OID NOT NULL,
		umoptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_foreign_server (
		srvname CIDR(2147483647) NOT NULL,
		srvowner OID NOT NULL,
		srvfdw OID NOT NULL,
		srvtype TEXT(2147483647),
		srvversion TEXT(2147483647),
		srvacl ACLITEM[ ],
		srvoptions TEXT[ ](2147483647)
	);

CREATE TABLE sequence (
		seq_name VARCHAR(50) NOT NULL,
		seq_count NUMERIC(38 , 0)
	);

CREATE TABLE pg_collation (
		collname CIDR(2147483647) NOT NULL,
		collnamespace OID NOT NULL,
		collowner OID NOT NULL,
		collencoding INT4 NOT NULL,
		collcollate CIDR(2147483647) NOT NULL,
		collctype CIDR(2147483647) NOT NULL
	);

CREATE TABLE pg_ts_config_map (
		mapcfg OID NOT NULL,
		maptokentype INT4 NOT NULL,
		mapseqno INT4 NOT NULL,
		mapdict OID NOT NULL
	);

CREATE TABLE pg_ts_dict (
		dictname CIDR(2147483647) NOT NULL,
		dictnamespace OID NOT NULL,
		dictowner OID NOT NULL,
		dicttemplate OID NOT NULL,
		dictinitoption TEXT(2147483647)
	);

CREATE TABLE radiologistprovider (
		id INT8 NOT NULL
	);

CREATE TABLE pg_attribute (
		attrelid OID NOT NULL,
		attname CIDR(2147483647) NOT NULL,
		atttypid OID NOT NULL,
		attstattarget INT4 NOT NULL,
		attlen INT2 NOT NULL,
		attnum INT2 NOT NULL,
		attndims INT4 NOT NULL,
		attcacheoff INT4 NOT NULL,
		atttypmod INT4 NOT NULL,
		attbyval BOOL NOT NULL,
		attstorage BPCHAR(1) NOT NULL,
		attalign BPCHAR(1) NOT NULL,
		attnotnull BOOL NOT NULL,
		atthasdef BOOL NOT NULL,
		attisdropped BOOL NOT NULL,
		attislocal BOOL NOT NULL,
		attinhcount INT4 NOT NULL,
		attcollation OID NOT NULL,
		attacl ACLITEM[ ],
		attoptions TEXT[ ](2147483647),
		attfdwoptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_largeobject_metadata (
		lomowner OID NOT NULL,
		lomacl ACLITEM[ ]
	);

CREATE TABLE provider (
		id INT8 NOT NULL,
		ptype VARCHAR(31),
		name VARCHAR(255),
		npi INT8,
		spec VARCHAR(255)
	);

CREATE TABLE pg_ts_template (
		tmplname CIDR(2147483647) NOT NULL,
		tmplnamespace OID NOT NULL,
		tmplinit REGPROC NOT NULL,
		tmpllexize REGPROC NOT NULL
	);

CREATE TABLE pg_depend (
		classid OID NOT NULL,
		objid OID NOT NULL,
		objsubid INT4 NOT NULL,
		refclassid OID NOT NULL,
		refobjid OID NOT NULL,
		refobjsubid INT4 NOT NULL,
		deptype BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_db_role_setting (
		setdatabase OID NOT NULL,
		setrole OID NOT NULL,
		setconfig TEXT[ ](2147483647)
	);

CREATE TABLE pg_authid (
		rolname CIDR(2147483647) NOT NULL,
		rolsuper BOOL NOT NULL,
		rolinherit BOOL NOT NULL,
		rolcreaterole BOOL NOT NULL,
		rolcreatedb BOOL NOT NULL,
		rolcatupdate BOOL NOT NULL,
		rolcanlogin BOOL NOT NULL,
		rolreplication BOOL NOT NULL,
		rolconnlimit INT4 NOT NULL,
		rolpassword TEXT(2147483647),
		rolvaliduntil TIMESTAMPTZ
	);

CREATE TABLE pg_largeobject_metadata (
		lomowner OID NOT NULL,
		lomacl ACLITEM[ ]
	);

CREATE TABLE pg_ts_config (
		cfgname CIDR(2147483647) NOT NULL,
		cfgnamespace OID NOT NULL,
		cfgowner OID NOT NULL,
		cfgparser OID NOT NULL
	);

CREATE TABLE pg_opfamily (
		opfmethod OID NOT NULL,
		opfname CIDR(2147483647) NOT NULL,
		opfnamespace OID NOT NULL,
		opfowner OID NOT NULL
	);

CREATE TABLE pg_shdescription (
		objoid OID NOT NULL,
		classoid OID NOT NULL,
		description TEXT(2147483647)
	);

CREATE TABLE pg_depend (
		classid OID NOT NULL,
		objid OID NOT NULL,
		objsubid INT4 NOT NULL,
		refclassid OID NOT NULL,
		refobjid OID NOT NULL,
		refobjsubid INT4 NOT NULL,
		deptype BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_enum (
		enumtypid OID NOT NULL,
		enumsortorder FLOAT4 NOT NULL,
		enumlabel CIDR(2147483647) NOT NULL
	);

CREATE TABLE pg_range (
		rngtypid OID NOT NULL,
		rngsubtype OID NOT NULL,
		rngcollation OID NOT NULL,
		rngsubopc OID NOT NULL,
		rngcanonical REGPROC NOT NULL,
		rngsubdiff REGPROC NOT NULL
	);

CREATE TABLE radiologytreatment (
		id INT8 NOT NULL,
		dates BYTEA(2147483647)
	);

CREATE TABLE surgerytreatment (
		id INT8 NOT NULL,
		date DATE,
		surgeon VARCHAR(255)
	);

CREATE TABLE pg_shseclabel (
		objoid OID NOT NULL,
		classoid OID NOT NULL,
		provider TEXT(2147483647),
		label TEXT(2147483647)
	);

CREATE TABLE pg_operator (
		oprname CIDR(2147483647) NOT NULL,
		oprnamespace OID NOT NULL,
		oprowner OID NOT NULL,
		oprkind BPCHAR(1) NOT NULL,
		oprcanmerge BOOL NOT NULL,
		oprcanhash BOOL NOT NULL,
		oprleft OID NOT NULL,
		oprright OID NOT NULL,
		oprresult OID NOT NULL,
		oprcom OID NOT NULL,
		oprnegate OID NOT NULL,
		oprcode REGPROC NOT NULL,
		oprrest REGPROC NOT NULL,
		oprjoin REGPROC NOT NULL
	);

CREATE TABLE pg_namespace (
		nspname CIDR(2147483647) NOT NULL,
		nspowner OID NOT NULL,
		nspacl ACLITEM[ ]
	);

CREATE TABLE pg_database (
		datname CIDR(2147483647) NOT NULL,
		datdba OID NOT NULL,
		encoding INT4 NOT NULL,
		datcollate CIDR(2147483647) NOT NULL,
		datctype CIDR(2147483647) NOT NULL,
		datistemplate BOOL NOT NULL,
		datallowconn BOOL NOT NULL,
		datconnlimit INT4 NOT NULL,
		datlastsysoid OID NOT NULL,
		datfrozenxid XID NOT NULL,
		datminmxid XID NOT NULL,
		dattablespace OID NOT NULL,
		datacl ACLITEM[ ]
	);

CREATE TABLE pg_class (
		relname CIDR(2147483647) NOT NULL,
		relnamespace OID NOT NULL,
		reltype OID NOT NULL,
		reloftype OID NOT NULL,
		relowner OID NOT NULL,
		relam OID NOT NULL,
		relfilenode OID NOT NULL,
		reltablespace OID NOT NULL,
		relpages INT4 NOT NULL,
		reltuples FLOAT4 NOT NULL,
		relallvisible INT4 NOT NULL,
		reltoastrelid OID NOT NULL,
		reltoastidxid OID NOT NULL,
		relhasindex BOOL NOT NULL,
		relisshared BOOL NOT NULL,
		relpersistence BPCHAR(1) NOT NULL,
		relkind BPCHAR(1) NOT NULL,
		relnatts INT2 NOT NULL,
		relchecks INT2 NOT NULL,
		relhasoids BOOL NOT NULL,
		relhaspkey BOOL NOT NULL,
		relhasrules BOOL NOT NULL,
		relhastriggers BOOL NOT NULL,
		relhassubclass BOOL NOT NULL,
		relispopulated BOOL NOT NULL,
		relfrozenxid XID NOT NULL,
		relminmxid XID NOT NULL,
		relacl ACLITEM[ ],
		reloptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_seclabel (
		objoid OID NOT NULL,
		classoid OID NOT NULL,
		objsubid INT4 NOT NULL,
		provider TEXT(2147483647),
		label TEXT(2147483647)
	);

CREATE TABLE pg_inherits (
		inhrelid OID NOT NULL,
		inhparent OID NOT NULL,
		inhseqno INT4 NOT NULL
	);

CREATE TABLE pg_tablespace (
		spcname CIDR(2147483647) NOT NULL,
		spcowner OID NOT NULL,
		spcacl ACLITEM[ ],
		spcoptions TEXT[ ](2147483647)
	);

CREATE TABLE pg_am (
		amname CIDR(2147483647) NOT NULL,
		amstrategies INT2 NOT NULL,
		amsupport INT2 NOT NULL,
		amcanorder BOOL NOT NULL,
		amcanorderbyop BOOL NOT NULL,
		amcanbackward BOOL NOT NULL,
		amcanunique BOOL NOT NULL,
		amcanmulticol BOOL NOT NULL,
		amoptionalkey BOOL NOT NULL,
		amsearcharray BOOL NOT NULL,
		amsearchnulls BOOL NOT NULL,
		amstorage BOOL NOT NULL,
		amclusterable BOOL NOT NULL,
		ampredlocks BOOL NOT NULL,
		amkeytype OID NOT NULL,
		aminsert REGPROC NOT NULL,
		ambeginscan REGPROC NOT NULL,
		amgettuple REGPROC NOT NULL,
		amgetbitmap REGPROC NOT NULL,
		amrescan REGPROC NOT NULL,
		amendscan REGPROC NOT NULL,
		ammarkpos REGPROC NOT NULL,
		amrestrpos REGPROC NOT NULL,
		ambuild REGPROC NOT NULL,
		ambuildempty REGPROC NOT NULL,
		ambulkdelete REGPROC NOT NULL,
		amvacuumcleanup REGPROC NOT NULL,
		amcanreturn REGPROC NOT NULL,
		amcostestimate REGPROC NOT NULL,
		amoptions REGPROC NOT NULL
	);

CREATE TABLE pg_pltemplate (
		tmplname CIDR(2147483647) NOT NULL,
		tmpltrusted BOOL NOT NULL,
		tmpldbacreate BOOL NOT NULL,
		tmplhandler TEXT(2147483647),
		tmplinline TEXT(2147483647),
		tmplvalidator TEXT(2147483647),
		tmpllibrary TEXT(2147483647),
		tmplacl ACLITEM[ ]
	);

CREATE TABLE pg_language (
		lanname CIDR(2147483647) NOT NULL,
		lanowner OID NOT NULL,
		lanispl BOOL NOT NULL,
		lanpltrusted BOOL NOT NULL,
		lanplcallfoid OID NOT NULL,
		laninline OID NOT NULL,
		lanvalidator OID NOT NULL,
		lanacl ACLITEM[ ]
	);

CREATE TABLE pg_cast (
		castsource OID NOT NULL,
		casttarget OID NOT NULL,
		castfunc OID NOT NULL,
		castcontext BPCHAR(1) NOT NULL,
		castmethod BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_amop (
		amopfamily OID NOT NULL,
		amoplefttype OID NOT NULL,
		amoprighttype OID NOT NULL,
		amopstrategy INT2 NOT NULL,
		amoppurpose BPCHAR(1) NOT NULL,
		amopopr OID NOT NULL,
		amopmethod OID NOT NULL,
		amopsortfamily OID NOT NULL
	);

CREATE TABLE pg_trigger (
		tgrelid OID NOT NULL,
		tgname CIDR(2147483647) NOT NULL,
		tgfoid OID NOT NULL,
		tgtype INT2 NOT NULL,
		tgenabled BPCHAR(1) NOT NULL,
		tgisinternal BOOL NOT NULL,
		tgconstrrelid OID NOT NULL,
		tgconstrindid OID NOT NULL,
		tgconstraint OID NOT NULL,
		tgdeferrable BOOL NOT NULL,
		tginitdeferred BOOL NOT NULL,
		tgnargs INT2 NOT NULL,
		tgattr null NOT NULL,
		tgargs BYTEA(2147483647),
		tgqual null
	);

CREATE TABLE pg_index (
		indexrelid OID NOT NULL,
		indrelid OID NOT NULL,
		indnatts INT2 NOT NULL,
		indisunique BOOL NOT NULL,
		indisprimary BOOL NOT NULL,
		indisexclusion BOOL NOT NULL,
		indimmediate BOOL NOT NULL,
		indisclustered BOOL NOT NULL,
		indisvalid BOOL NOT NULL,
		indcheckxmin BOOL NOT NULL,
		indisready BOOL NOT NULL,
		indislive BOOL NOT NULL,
		indkey null NOT NULL,
		indcollation null NOT NULL,
		indclass null NOT NULL,
		indoption null NOT NULL,
		indexprs null,
		indpred null
	);

CREATE TABLE pg_auth_members (
		roleid OID NOT NULL,
		member OID NOT NULL,
		grantor OID NOT NULL,
		admin_option BOOL NOT NULL
	);

CREATE TABLE pg_amproc (
		amprocfamily OID NOT NULL,
		amproclefttype OID NOT NULL,
		amprocrighttype OID NOT NULL,
		amprocnum INT2 NOT NULL,
		amproc REGPROC NOT NULL
	);

CREATE TABLE pg_ts_parser (
		prsname CIDR(2147483647) NOT NULL,
		prsnamespace OID NOT NULL,
		prsstart REGPROC NOT NULL,
		prstoken REGPROC NOT NULL,
		prsend REGPROC NOT NULL,
		prsheadline REGPROC NOT NULL,
		prslextype REGPROC NOT NULL
	);

CREATE TABLE pg_shdepend (
		dbid OID NOT NULL,
		classid OID NOT NULL,
		objid OID NOT NULL,
		objsubid INT4 NOT NULL,
		refclassid OID NOT NULL,
		refobjid OID NOT NULL,
		deptype BPCHAR(1) NOT NULL
	);

CREATE TABLE pg_proc (
		proname CIDR(2147483647) NOT NULL,
		pronamespace OID NOT NULL,
		proowner OID NOT NULL,
		prolang OID NOT NULL,
		procost FLOAT4 NOT NULL,
		prorows FLOAT4 NOT NULL,
		provariadic OID NOT NULL,
		protransform REGPROC NOT NULL,
		proisagg BOOL NOT NULL,
		proiswindow BOOL NOT NULL,
		prosecdef BOOL NOT NULL,
		proleakproof BOOL NOT NULL,
		proisstrict BOOL NOT NULL,
		proretset BOOL NOT NULL,
		provolatile BPCHAR(1) NOT NULL,
		pronargs INT2 NOT NULL,
		pronargdefaults INT2 NOT NULL,
		prorettype OID NOT NULL,
		proargtypes null NOT NULL,
		proallargtypes OID[ ],
		proargmodes ABSTIME[ ],
		proargnames TEXT[ ](2147483647),
		proargdefaults null,
		prosrc TEXT(2147483647),
		probin TEXT(2147483647),
		proconfig TEXT[ ](2147483647),
		proacl ACLITEM[ ]
	);

CREATE TABLE pg_statistic (
		starelid OID NOT NULL,
		staattnum INT2 NOT NULL,
		stainherit BOOL NOT NULL,
		stanullfrac FLOAT4 NOT NULL,
		stawidth INT4 NOT NULL,
		stadistinct FLOAT4 NOT NULL,
		stakind1 INT2 NOT NULL,
		stakind2 INT2 NOT NULL,
		stakind3 INT2 NOT NULL,
		stakind4 INT2 NOT NULL,
		stakind5 INT2 NOT NULL,
		staop1 OID NOT NULL,
		staop2 OID NOT NULL,
		staop3 OID NOT NULL,
		staop4 OID NOT NULL,
		staop5 OID NOT NULL,
		stanumbers1 FLOAT4[ ],
		stanumbers2 FLOAT4[ ],
		stanumbers3 FLOAT4[ ],
		stanumbers4 FLOAT4[ ],
		stanumbers5 FLOAT4[ ],
		stavalues1 null,
		stavalues2 null,
		stavalues3 null,
		stavalues4 null,
		stavalues5 null
	);

CREATE TABLE physicianprovider (
		id INT8 NOT NULL
	);

CREATE UNIQUE INDEX pg_db_role_setting_databaseid_rol_index ON pg_db_role_setting (setdatabase ASC, setrole ASC);

CREATE UNIQUE INDEX pg_language_name_index ON pg_language (lanname ASC);

CREATE UNIQUE INDEX pg_ts_parser_oid_index ON pg_ts_parser (null);

CREATE UNIQUE INDEX pg_amop_oid_index ON pg_amop (null);

CREATE UNIQUE INDEX pg_foreign_data_wrapper_oid_index ON pg_foreign_data_wrapper (null);

CREATE UNIQUE INDEX treatment_pkey ON treatment (id ASC);

CREATE UNIQUE INDEX pg_conversion_name_nsp_index ON pg_conversion (conname ASC, connamespace ASC);

CREATE UNIQUE INDEX pg_operator_oprname_l_r_n_index ON pg_operator (oprname ASC, oprleft ASC, oprright ASC, oprnamespace ASC);

CREATE INDEX pg_trigger_tgconstraint_index ON pg_trigger (tgconstraint ASC);

CREATE UNIQUE INDEX pg_aggregate_fnoid_index ON pg_aggregate (aggfnoid ASC);

CREATE INDEX pg_shdepend_reference_index ON pg_shdepend (refclassid ASC, refobjid ASC);

CREATE UNIQUE INDEX pg_attrdef_adrelid_adnum_index ON pg_attrdef (adrelid ASC, adnum ASC);

CREATE UNIQUE INDEX pg_collation_name_enc_nsp_index ON pg_collation (collname ASC, collencoding ASC, collnamespace ASC);

CREATE UNIQUE INDEX pg_range_rngtypid_index ON pg_range (rngtypid ASC);

CREATE UNIQUE INDEX pg_shseclabel_object_index ON pg_shseclabel (objoid ASC, classoid ASC, provider ASC);

CREATE UNIQUE INDEX pg_ts_parser_prsname_index ON pg_ts_parser (prsname ASC, prsnamespace ASC);

CREATE UNIQUE INDEX pg_index_indexrelid_index ON pg_index (indexrelid ASC);

CREATE UNIQUE INDEX pg_conversion_default_index ON pg_conversion (connamespace ASC, conforencoding ASC, contoencoding ASC);

CREATE UNIQUE INDEX pg_user_mapping_oid_index ON pg_user_mapping (null);

CREATE UNIQUE INDEX pg_am_oid_index ON pg_am (null);

CREATE UNIQUE INDEX pg_amproc_oid_index ON pg_amproc (null);

CREATE UNIQUE INDEX pg_auth_members_role_member_index ON pg_auth_members (roleid ASC, member ASC);

CREATE UNIQUE INDEX pg_inherits_relid_seqno_index ON pg_inherits (inhrelid ASC, inhseqno ASC);

CREATE UNIQUE INDEX pg_amop_opr_fam_index ON pg_amop (amopopr ASC, amoppurpose ASC, amopfamily ASC);

CREATE UNIQUE INDEX pg_ts_dict_dictname_index ON pg_ts_dict (dictname ASC, dictnamespace ASC);

CREATE UNIQUE INDEX pg_amproc_fam_proc_index ON pg_amproc (amprocfamily ASC, amproclefttype ASC, amprocrighttype ASC, amprocnum ASC);

CREATE UNIQUE INDEX pg_pltemplate_name_index ON pg_pltemplate (tmplname ASC);

CREATE UNIQUE INDEX pg_attrdef_oid_index ON pg_attrdef (null);

CREATE UNIQUE INDEX pg_database_oid_index ON pg_database (null);

CREATE UNIQUE INDEX pg_am_name_index ON pg_am (amname ASC);

CREATE UNIQUE INDEX pg_trigger_tgrelid_tgname_index ON pg_trigger (tgrelid ASC, tgname ASC);

CREATE INDEX pg_constraint_conrelid_index ON pg_constraint (conrelid ASC);

CREATE UNIQUE INDEX pg_authid_rolname_index ON pg_authid (rolname ASC);

CREATE UNIQUE INDEX pg_foreign_server_oid_index ON pg_foreign_server (null);

CREATE UNIQUE INDEX pg_rewrite_rel_rulename_index ON pg_rewrite (ev_class ASC, rulename ASC);

CREATE UNIQUE INDEX pg_foreign_table_relid_index ON pg_foreign_table (ftrelid ASC);

CREATE UNIQUE INDEX pg_extension_oid_index ON pg_extension (null);

CREATE UNIQUE INDEX pg_default_acl_role_nsp_obj_index ON pg_default_acl (defaclrole ASC, defaclnamespace ASC, defaclobjtype ASC);

CREATE UNIQUE INDEX pg_description_o_c_o_index ON pg_description (objoid ASC, classoid ASC, objsubid ASC);

CREATE UNIQUE INDEX provider_pkey ON provider (id ASC);

CREATE UNIQUE INDEX pg_attribute_relid_attnam_index ON pg_attribute (attrelid ASC, attname ASC);

CREATE UNIQUE INDEX pg_class_oid_index ON pg_class (null);

CREATE UNIQUE INDEX pg_attribute_relid_attnum_index ON pg_attribute (attrelid ASC, attnum ASC);

CREATE UNIQUE INDEX pg_ts_config_oid_index ON pg_ts_config (null);

CREATE UNIQUE INDEX pg_event_trigger_evtname_index ON pg_event_trigger (evtname ASC);

CREATE UNIQUE INDEX pg_language_oid_index ON pg_language (null);

CREATE INDEX pg_constraint_contypid_index ON pg_constraint (contypid ASC);

CREATE UNIQUE INDEX surgeonprovider_pkey ON surgeonprovider (id ASC);

CREATE UNIQUE INDEX pg_auth_members_member_role_index ON pg_auth_members (member ASC, roleid ASC);

CREATE UNIQUE INDEX drugtreatment_pkey ON drugtreatment (id ASC);

CREATE UNIQUE INDEX pg_enum_oid_index ON pg_enum (null);

CREATE INDEX pg_depend_reference_index ON pg_depend (refclassid ASC, refobjid ASC, refobjsubid ASC);

CREATE UNIQUE INDEX pg_largeobject_loid_pn_index ON pg_largeobject (loid ASC, pageno ASC);

CREATE UNIQUE INDEX pg_database_datname_index ON pg_database (datname ASC);

CREATE UNIQUE INDEX pg_ts_config_map_index ON pg_ts_config_map (mapcfg ASC, maptokentype ASC, mapseqno ASC);

CREATE UNIQUE INDEX pg_rewrite_oid_index ON pg_rewrite (null);

CREATE UNIQUE INDEX pg_cast_source_target_index ON pg_cast (castsource ASC, casttarget ASC);

CREATE UNIQUE INDEX pg_namespace_nspname_index ON pg_namespace (nspname ASC);

CREATE UNIQUE INDEX pg_shdescription_o_c_index ON pg_shdescription (objoid ASC, classoid ASC);

CREATE UNIQUE INDEX pg_user_mapping_user_server_index ON pg_user_mapping (umuser ASC, umserver ASC);

CREATE UNIQUE INDEX pg_cast_oid_index ON pg_cast (null);

CREATE UNIQUE INDEX surgerytreatment_pkey ON surgerytreatment (id ASC);

CREATE UNIQUE INDEX pg_opclass_oid_index ON pg_opclass (null);

CREATE UNIQUE INDEX pg_opclass_am_name_nsp_index ON pg_opclass (opcmethod ASC, opcname ASC, opcnamespace ASC);

CREATE UNIQUE INDEX pg_proc_oid_index ON pg_proc (null);

CREATE UNIQUE INDEX pg_conversion_oid_index ON pg_conversion (null);

CREATE UNIQUE INDEX pg_tablespace_oid_index ON pg_tablespace (null);

CREATE UNIQUE INDEX pg_type_oid_index ON pg_type (null);

CREATE UNIQUE INDEX patient_pkey ON patient (id ASC);

CREATE UNIQUE INDEX pg_collation_oid_index ON pg_collation (null);

CREATE UNIQUE INDEX pg_enum_typid_sortorder_index ON pg_enum (enumtypid ASC, enumsortorder ASC);

CREATE INDEX pg_depend_depender_index ON pg_depend (classid ASC, objid ASC, objsubid ASC);

CREATE UNIQUE INDEX sequence_pkey ON sequence (seq_name ASC);

CREATE UNIQUE INDEX pg_namespace_oid_index ON pg_namespace (null);

CREATE UNIQUE INDEX pg_default_acl_oid_index ON pg_default_acl (null);

CREATE UNIQUE INDEX pg_extension_name_index ON pg_extension (extname ASC);

CREATE UNIQUE INDEX pg_trigger_oid_index ON pg_trigger (null);

CREATE UNIQUE INDEX radiologytreatment_pkey ON radiologytreatment (id ASC);

CREATE UNIQUE INDEX pg_ts_dict_oid_index ON pg_ts_dict (null);

CREATE UNIQUE INDEX pg_ts_config_cfgname_index ON pg_ts_config (cfgname ASC, cfgnamespace ASC);

CREATE INDEX pg_constraint_conname_nsp_index ON pg_constraint (conname ASC, connamespace ASC);

CREATE UNIQUE INDEX pg_opfamily_am_name_nsp_index ON pg_opfamily (opfmethod ASC, opfname ASC, opfnamespace ASC);

CREATE UNIQUE INDEX pg_event_trigger_oid_index ON pg_event_trigger (null);

CREATE UNIQUE INDEX pg_class_relname_nsp_index ON pg_class (relname ASC, relnamespace ASC);

CREATE UNIQUE INDEX radiologistprovider_pkey ON radiologistprovider (id ASC);

CREATE UNIQUE INDEX pg_statistic_relid_att_inh_index ON pg_statistic (starelid ASC, staattnum ASC, stainherit ASC);

CREATE UNIQUE INDEX pg_tablespace_spcname_index ON pg_tablespace (spcname ASC);

CREATE UNIQUE INDEX pg_proc_proname_args_nsp_index ON pg_proc (proname ASC, proargtypes ASC, pronamespace ASC);

CREATE UNIQUE INDEX pg_amop_fam_strat_index ON pg_amop (amopfamily ASC, amoplefttype ASC, amoprighttype ASC, amopstrategy ASC);

CREATE UNIQUE INDEX pg_seclabel_object_index ON pg_seclabel (objoid ASC, classoid ASC, objsubid ASC, provider ASC);

CREATE UNIQUE INDEX physicianprovider_pkey ON physicianprovider (id ASC);

CREATE INDEX pg_index_indrelid_index ON pg_index (indrelid ASC);

CREATE UNIQUE INDEX pg_ts_template_tmplname_index ON pg_ts_template (tmplname ASC, tmplnamespace ASC);

CREATE UNIQUE INDEX pg_enum_typid_label_index ON pg_enum (enumtypid ASC, enumlabel ASC);

CREATE UNIQUE INDEX pg_opfamily_oid_index ON pg_opfamily (null);

CREATE INDEX pg_inherits_parent_index ON pg_inherits (inhparent ASC);

CREATE INDEX pg_shdepend_depender_index ON pg_shdepend (dbid ASC, classid ASC, objid ASC, objsubid ASC);

CREATE UNIQUE INDEX pg_foreign_data_wrapper_name_index ON pg_foreign_data_wrapper (fdwname ASC);

CREATE UNIQUE INDEX pg_foreign_server_name_index ON pg_foreign_server (srvname ASC);

CREATE UNIQUE INDEX pg_type_typname_nsp_index ON pg_type (typname ASC, typnamespace ASC);

CREATE UNIQUE INDEX pg_authid_oid_index ON pg_authid (null);

CREATE UNIQUE INDEX pg_ts_template_oid_index ON pg_ts_template (null);

CREATE UNIQUE INDEX pg_operator_oid_index ON pg_operator (null);

CREATE UNIQUE INDEX pg_largeobject_metadata_oid_index ON pg_largeobject_metadata (null);

CREATE UNIQUE INDEX pg_constraint_oid_index ON pg_constraint (null);

ALTER TABLE surgeonprovider ADD CONSTRAINT surgeonprovider_pkey PRIMARY KEY (id);

ALTER TABLE sequence ADD CONSTRAINT sequence_pkey PRIMARY KEY (seq_name);

ALTER TABLE provider ADD CONSTRAINT provider_pkey PRIMARY KEY (id);

ALTER TABLE physicianprovider ADD CONSTRAINT physicianprovider_pkey PRIMARY KEY (id);

ALTER TABLE drugtreatment ADD CONSTRAINT drugtreatment_pkey PRIMARY KEY (id);

ALTER TABLE radiologistprovider ADD CONSTRAINT radiologistprovider_pkey PRIMARY KEY (id);

ALTER TABLE patient ADD CONSTRAINT patient_pkey PRIMARY KEY (id);

ALTER TABLE radiologytreatment ADD CONSTRAINT radiologytreatment_pkey PRIMARY KEY (id);

ALTER TABLE surgerytreatment ADD CONSTRAINT surgerytreatment_pkey PRIMARY KEY (id);

ALTER TABLE treatment ADD CONSTRAINT treatment_pkey PRIMARY KEY (id);

ALTER TABLE drugtreatment ADD CONSTRAINT fk_drugtreatment_id FOREIGN KEY (id)
	REFERENCES treatment (id);

ALTER TABLE surgeonprovider ADD CONSTRAINT fk_surgeonprovider_id FOREIGN KEY (id)
	REFERENCES provider (id);

ALTER TABLE radiologytreatment ADD CONSTRAINT fk_radiologytreatment_id FOREIGN KEY (id)
	REFERENCES treatment (id);

ALTER TABLE treatment ADD CONSTRAINT fk_treatment_patient_fk FOREIGN KEY (patient_fk)
	REFERENCES patient (id);

ALTER TABLE radiologistprovider ADD CONSTRAINT fk_radiologistprovider_id FOREIGN KEY (id)
	REFERENCES provider (id);

ALTER TABLE physicianprovider ADD CONSTRAINT fk_physicianprovider_id FOREIGN KEY (id)
	REFERENCES provider (id);

ALTER TABLE treatment ADD CONSTRAINT fk_treatment_provider_fk FOREIGN KEY (provider_fk)
	REFERENCES provider (id);

ALTER TABLE surgerytreatment ADD CONSTRAINT fk_surgerytreatment_id FOREIGN KEY (id)
	REFERENCES treatment (id);

