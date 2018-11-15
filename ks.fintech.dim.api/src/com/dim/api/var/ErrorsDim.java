package com.dim.api.var;

public class ErrorsDim {
    /** 500014;操作失败，数据源[{0}]不存在。 */
    public static final String DATA_SORUCE_NOT_EXIST_EXCEPTION = "dataSoruceNotExistException";
    /** 500013;删除失败，数据源[{0}]已经被其他对象引用。 */
    public static final String DATA_SORUCE_REF_EXCEPTION = "dataSoruceRefException";
    /** 500029;过滤维度绑定所需字段不能为空,为空字段：[{0}]。 */
    public static final String DIM_DIMENSION_FILTER_NEEDS_OTHER = "dimDimensionFilterNeedsOther";
    /** 500030;此维度已经被作为父维度，不能删除，请先删除其子维度。 */
    public static final String DIM_DIMENSION_HAS_PARENT_ID = "dimDimensionHasParentId";
    /** 500028;操作失败，维度[{0}]不存在。 */
    public static final String DIM_DIMENSION_NOT_EXIST_EXCEPTION = "dimDimensionNotExistException";
    /** 500031;输入组件类型为查询时，必须选择查询组件。 */
    public static final String DIM_DIMENSION_QUERY_INFO = "dimDimensionQueryInfo";
    /** 500011;文件夹含有子文件夹，不允许删除，父文件夹[{0}]。 */
    public static final String DIM_FUNCTION_CATEGORY_HAS_CHILD = "dimFunctionCategoryHasChild";
    /** 500010;指标函数目录重复错误,重复名称[{0}]。 */
    public static final String DIM_FUNCTION_CATEGORY_NAME_SAME_EXCEPTION = "dimFunctionCategoryNameSameException";
    /** 500027;删除失败，该目录中含有指标函数。 */
    public static final String DIM_FUNCTION_CATEGORY_REF_EXCEPTION = "dimFunctionCategoryRefException";
    /** 500009;指标函数名称重复错误,重复名称[{0}]。 */
    public static final String DIM_FUNCTION_NAME_SAME_EXCEPTION = "dimFunctionNameSameException";
    /** 500022;操作失败，指标函数[{0}]不存在。 */
    public static final String DIM_FUNCTION_NOT_EXIST_EXCEPTION = "dimFunctionNotExistException";
    /** 500032;请选择功能。 */
    public static final String DIM_FUNCTION_PARAM_FUNC_ID_IS_EMPTY = "dimFunctionParamFuncIdIsEmpty";
    /** 500019;指标函数参数名称重复错误,重复参数名称[{0}]。 */
    public static final String DIM_FUNCTION_PARAM_SAME_NAME_EXCEPTION = "dimFunctionParamSameNameException";
    /** 500016;查询对象目录还有子目录，不允许删除，父目录：[{0}]。 */
    public static final String DIM_QUERY_CATEGORY_HAS_CHILD = "dimQueryCategoryHasChild";
    /** 500015;查询对象目录重复错误，重复名称：[{0}]。 */
    public static final String DIM_QUERY_CATEGORY_NAME_SAME_EXCEPTION = "dimQueryCategoryNameSameException";
    /** 500026;删除失败，该目录中含有查询对象。 */
    public static final String DIM_QUERY_CATEGORY_REF_EXCEPTION = "dimQueryCategoryRefException";
    /** 500025;所选功能无公共关联维度。 */
    public static final String DIM_QUERY_DIMENSION_BY_FUNC_ID = "dimQueryDimensionByFuncId";
    /** 500017;查询对象名称重复错误，重复名称：[{0}]。 */
    public static final String DIM_QUERY_NAME_SAME_EXCEPTION = "dimQueryNameSameException";
    /** 500018;操作失败，查询对象[{0}]不存在。 */
    public static final String DIM_QUERY_NOT_EXIST_EXCEPTION = "dimQueryNotExistException";
    /** 500033;请检查相关表达式的书写，此表达式执行返回格式不正确。ID为[{0}]。 */
    public static final String DIM_QUERY_PLZ_CHECKSQL = "dimQueryPlzCheckSQL";
    /** 500036;数据源查询语句中数据不存在或者存在多条，请检查！ */
    public static final String DIM_QUERY_QUERY_EXCU_EXP_RE = "dimQueryQueryExcuExpRe";
    /** 500035;设定类型与查出数据类型不匹配，请检查！ID为[{0}] */
    public static final String DIM_QUERY_QUERY_EXCU_EXP_RESULT = "dimQueryQueryExcuExpResult";
    /** 500024;删除失败，查询对象[{0}]已经被维度引用。 */
    public static final String DIM_QUERY_REF_BY_DIMENSION_EXCEPTION = "dimQueryRefByDimensionException";
    /** 500023;删除失败，查询对象[{0}]已经被指标函数引用。 */
    public static final String DIM_QUERY_REF_BY_FUNCTION_EXCEPTION = "dimQueryRefByFunctionException";
    /** 500034;文件夹ID为[{0}]中，存在未删除的模板或者子文件夹，请像将其内容删除。 */
    public static final String DIM_TEMPLATE_FOLDER_DELETE_ERROR = "dimTemplateFolderDeleteError";
    /** 500021;操作失败，模板[{0}]不存在。 */
    public static final String DIM_TEMPLATE_NOT_EXIST_EXCEPTION = "dimTemplateNotExistException";
    /** 500020;模板名称重复错误,重复名称[{0}]。 */
    public static final String DIM_TEMPLATE_SAME_NAME_EXCEPTION = "dimTemplateSameNameException";
    /** 500012;参数控件类型名称重复错误,重复名称[{0}]。 */
    public static final String PARAM_CONTROL_TYPE_NAME_SAME_EXCEPTION = "paramControlTypeNameSameException";
    /** 500008;数据源名称重复错误,重复名称[{0}]。 */
    public static final String SOURCE_NAME_SAME_EXCEPTION = "sourceNameSameException";
}
