<%--

    The MIT License
    Copyright (c) 2011 Kuali Mobility Team

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.

--%>
#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

<%@ page language="java" contentType="application/javascript; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

var dining = angular.module("${toolNameShort}App", ['ngRoute','ngSanitize','ui.bootstrap'],
	function($routeProvider,$locationProvider) {
		$locationProvider.html5Mode(false);
		$routeProvider.
			when('/', {  templateUrl: '${pageContext.request.contextPath}/${toolNameShort}/templates/${toolNameShort}',	 controller: '${fileNamePrefix}Controller' }).
			otherwise({ redirectTo: "/" });
	});

${toolNameShort}.factory('${fileNamePrefix}Data',function() {
	return {
		errors:null,
		infos:null,
		successes:null,
		alerts:null
	};
});

${toolNameShort}.directive('notificationList', function() {
	return {
		restrict:'E',
		transclude:true,
		replace:true,
		templateUrl: '${pageContext.request.contextPath}/${toolNameShort}/templates/notificationList'
	}
});

${toolNameShort}.directive('${toolNameShort}Directive', function() {
	return {
		restrict:'E',
		transclude:true,
		replace:true,
		templateUrl: '${pageContext.request.contextPath}/${toolNameShort}/templates/${toolNameShort}'
	}
});

${toolNameShort}.controller("${fileNamePrefix}Controller", function($scope,$http,$routeParams,$templateCache,$location,$sce,$log,${fileNamePrefix}Data) {
	$scope.init = function() {
		$scope.${fileNamePrefix}Data = ${fileNamePrefix}Data;

		var menuItems = "{\"menus\": ["+
				"{ \"url\":\"/${toolNameShort}\" , \"label\":\"${fileNamePrefix}\" },"+
				"]}";

		$scope.menuItems = eval ("(" + menuItems + ")");
	}

	$scope.kmeNavLeft = function() {
		// send to home screen.
		${fileNamePrefix}Data.errors = [];
		${fileNamePrefix}Data.alerts = [];
		${fileNamePrefix}Data.infos = [];
		${fileNamePrefix}Data.successes = [];
		window.history.back();
	}

	$scope.clickHideErrors = function(obj) {
		var i = ${fileNamePrefix}Data.errors.indexOf(obj);
		if( i > -1 ) {
			${fileNamePrefix}Data.errors.splice(i,1);
		}
	}

	$scope.clickHideSuccesses = function(obj) {
		var i = ${fileNamePrefix}Data.successes.indexOf(obj);
		if( i > -1 ) {
			${fileNamePrefix}Data.successes.splice(i,1);
		}
	}

	$scope.clickHideInfos = function(obj) {
		var i = ${fileNamePrefix}Data.infos.indexOf(obj);
		if( i > -1 ) {
			${fileNamePrefix}Data.infos.splice(i,1);
		}
	}

	$scope.clickHideAlerts = function(obj) {
		var i = ${fileNamePrefix}Data.alerts.indexOf(obj);
		if( i > -1 ) {
			${fileNamePrefix}Data.alerts.splice(i,1);
		}
	}
});
