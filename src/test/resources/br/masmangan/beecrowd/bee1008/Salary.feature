#
# Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
# 
# This software is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This code is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this code.  If not, see <https://www.gnu.org/licenses/>.
#	
# Please visit Gherkin By Example at https://github.com/gherkin-by-example 
# if you need additional information or have any questions.
@domain
Feature: Salary

Narrative:

In order to avoid silly mistakes
  As a employer
  I want to be told the employee's number and salary that he/she will receive at end of the month, 
  with two decimal places

Scenario Outline: calculate average of three numbers

  the number is <number>
  <hours> hours
  U$ <amount> per hour
  salary is calculated
  result should be <salary>

Examples:
|  number |  hours |  amount | salary |
| 25 | 100 | 5.50 | 550.00 |
| 1 | 200 | 20.50 | 4100.00 |
| 6 | 145 | 15.55 | 2254.75 |