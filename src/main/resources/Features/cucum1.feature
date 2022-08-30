Feature: 使用Chrome浏览器打开百度搜索cucumber
  Scenario: 百度搜索cucumber
    Given 打开百度搜索
    When 输入 "cucumber"
    Then 显示 "cucumber"