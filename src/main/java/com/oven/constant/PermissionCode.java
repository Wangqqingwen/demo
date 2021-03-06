package com.oven.constant;

/**
 * 菜单权限Code定义类
 *
 * @author Oven
 */
public class PermissionCode {

    public static final String USER_MANAGER                       = "A1_01";      // 用户管理
    public static final String USER_INSERT                        = "A1_01_01";   // 添加用户
    public static final String USER_UPDATE                        = "A1_01_02";   // 修改用户
    public static final String USER_DELETE                        = "A1_01_03";   // 删除用户
    public static final String USER_SETSTATUS                     = "A1_01_04";   // 修改用户状态
    public static final String USER_SETROLE                       = "A1_01_05";   // 设置用户角色

    public static final String MENU_MANAGER                       = "A1_02";      // 菜单管理
    public static final String MENU_UPDATE                        = "A1_02_01";   // 修改菜单名称
    public static final String MENU_SETSTATUS                     = "A1_02_02";   // 修改菜单状态

    public static final String ROLE_MANAGER                       = "A1_03";      // 角色管理
    public static final String ROLE_INSERT                        = "A1_03_01";   // 添加角色
    public static final String ROLE_UPDATE                        = "A1_03_02";   // 修改角色
    public static final String ROLE_DELETE                        = "A1_03_03";   // 删除角色
    public static final String ROLE_SETSTATUS                     = "A1_03_04";   // 修改角色状态
    public static final String ROLE_SETMENU                       = "A1_03_05";   // 设置角色菜单

    public static final String LOG_MANAGER                        = "A1_04";      // 日志管理

    public static final String EMPLOYEE_MANAGER                   = "B1_01";      // 员工管理
    public static final String EMPLOYEE_INSERT                    = "B1_01_01";   // 添加员工
    public static final String EMPLOYEE_UPDATE                    = "B1_01_02";   // 修改员工
    public static final String EMPLOYEE_DELETE                    = "B1_01_03";   // 删除员工
    public static final String EMPLOYEE_SETSTATUS                 = "B1_01_04";   // 修改员工状态
    public static final String EMPLOYEE_SHOWMONEY                 = "B1_01_05";   // 显示金额

    public static final String WORKHOUR_MANAGER                   = "B1_02";      // 工时管理
    public static final String WORKHOUR_INSERT                    = "B1_02_01";   // 工时录入
    public static final String WORKHOUR_DELETE                    = "B1_02_02";   // 删除工时
    public static final String WORKHOUR_SHOW_MONEY                = "B1_02_03";   // 显示金额
    public static final String WORKHOUR_SHOW_TOTAL_WORKHOUR       = "B1_02_04";   // 显示总工时

    public static final String WORKHOUR_REPORT_MANAGERT           = "B1_04";      // 工时报表

    public static final String WORKSITE_MANAGER                   = "B1_03";      // 工地管理
    public static final String WORKSITE_INSERT                    = "B1_03_01";   // 添加工地
    public static final String WORKSITE_UPDATE                    = "B1_03_02";   // 修改工地
    public static final String WORKSITE_DELETE                    = "B1_03_03";   // 删除工地
    public static final String WORKSITE_SETSTATUS                 = "B1_03_04";   // 修改工地状态

    public static final String SALARY_PAY                         = "C1_01";      // 薪资发放
    public static final String SALARY_PAY_CHANGE_MONEY            = "C1_01_01";   // 更改实发金额
    public static final String SALARY_PAY_SHOW_TOTAL_MONEY        = "C1_01_02";   // 查看薪资总额
    public static final String SALARY_PAY_RECORD                  = "C1_02";      // 发薪记录
    public static final String SALARY_PAY_RECORD_SHOW_MONEY       = "C1_02_01";   // 显示发现记录金额
    public static final String SALARY_PAY_RECORD_SHOW_TOTAL_MONEY = "C1_02_02";   // 显示发现记录总金额
    public static final String ADVANCE_SALARY                     = "C1_03";      // 预支薪资
    public static final String ADVANCE_SALARY_INSERT              = "C1_03_01";   // 添加预支薪资
    public static final String ADVANCE_SALARY_DELETE              = "C1_03_02";   // 删除预支薪资
    public static final String ADVANCE_SALARY_SHOW_MONEY          = "C1_03_03";   // 显示金额
    public static final String ADVANCE_SALARY_SHOW_TOTAL_MONEY    = "C1_03_04";   // 显示预支总额
    public static final String FINANCE_MANAGE                     = "C1_04";      // 财务管理
    public static final String FINANCE_INSERT                     = "C1_04_01";   // 财务登记
    public static final String FINANCE_SHOW_MONEY                 = "C1_04_02";   // 显示金额
    public static final String FINANCE_DELETE                     = "C1_04_03";   // 删除财务登记
    public static final String FINANCE_SHOW_TOTAL_IN_MONEY        = "C1_04_04";   // 显示总登记金额
    public static final String FINANCE_SHOW_TOTAL_OUT_MONEY       = "C1_04_05";   // 显示总支出金额
    public static final String SALARY_COUNT                       = "C1_05";      // 薪资统计

    public static final String FUND_MANAGER                       = "D1_01";      // 基金管理
    public static final String FUND_INSERT                        = "D1_01_01";   // 添加基金
    public static final String FUND_UPDATE                        = "D1_01_02";   // 修改基金
    public static final String FUND_DELETE                        = "D1_01_03";   // 删除基金
    public static final String FUND_SETSTATUS                     = "D1_01_04";   // 修改基金状态
    public static final String FUND_UPDATE_ORDER                  = "D1_01_05";   // 修改基金排序值

    public static final String FUNDBILLCHARTS_MANAGER             = "D1_02";      // 收益报表

    public static final String FUNDBILL_MANAGER                   = "D1_03";      // 收益报表
    public static final String FUNDBILL_INSERT                    = "D1_03_01";   // 录入收益
    public static final String FUNDBILL_UPDATE                    = "D1_03_02";   // 修改收益
    public static final String FUNDBILL_DELETE                    = "D1_03_03";   // 删除收益

    public static final String WECHAT_FUND_MANAGER                = "D1_04";      // 微信基金
    public static final String WECHAT_FUND_INSERT                 = "D1_04_01";   // 录入收益

}
