
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<!-- meta tags and other links -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>AdKrive - Support Tickets</title>
    <!-- site favicon -->
    <base
	href="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />
    <link rel="shortcut icon" type="image/png" href="images/logoIcon/favicon.png">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700&display=swap">
    <!-- bootstrap 4  -->
    <link rel="stylesheet" href="css/vendor/bootstrap.min.css">
    <!-- bootstrap toggle css -->
    <link rel="stylesheet" href="css/vendor/bootstrap-toggle.min.css">
    <!-- fontawesome 5  -->
    <link rel="stylesheet" href="css/all.min.css">
    <!-- line-awesome webfont -->
    <link rel="stylesheet" href="css/line-awesome.min.css">

    
    <!-- custom select box css -->
    <link rel="stylesheet" href="css/vendor/nice-select.css">
    <!-- code preview css -->
    <link rel="stylesheet" href="css/vendor/prism.css">
    <!-- select 2 css -->
    <link rel="stylesheet" href="css/vendor/select2.min.css">
    <!-- jvectormap css -->
    <link rel="stylesheet" href="css/vendor/jquery-jvectormap-2.0.5.css">
    <!-- datepicker css -->
    <link rel="stylesheet" href="css/vendor/datepicker.min.css">
    <!-- timepicky for time picker css -->
    <link rel="stylesheet" href="css/vendor/jquery-timepicky.css">
    <!-- bootstrap-clockpicker css -->
    <link rel="stylesheet" href="css/vendor/bootstrap-clockpicker.min.css">
    <!-- bootstrap-pincode css -->
    <link rel="stylesheet" href="css/vendor/bootstrap-pincode-input.css">
    <!-- dashdoard main css -->
    <link rel="stylesheet" href="css/app.css">


    </head>
<body>
    <!-- page-wrapper start -->
    <div class="page-wrapper default-version">
        <div class="sidebar capsule--rounded bg_img overlay--indigo overlay--opacity-8"
     data-background="images/sidebar/2.jpg">
    <button class="res-sidebar-close-btn"><i class="las la-times"></i></button>
    <div class="sidebar__inner">
        <div class="sidebar__logo">
            <a href="/dashboard" class="sidebar__main-logo"><img
                    src="images/logoIcon/logo.png" alt="image"></a>
            <a href="/dashboard" class="sidebar__logo-shape"><img
                    src="images/logoIcon/favicon.png" alt="image"></a>
            <button type="button" class="navbar__expand"></button>
        </div>

        <div class="sidebar__menu-wrapper" id="sidebar__menuWrapper">
            <ul class="sidebar__menu">
                <li class="sidebar-menu-item ">
                    <a href="/dashboard" class="nav-link ">
                        <i class="menu-icon las la-home"></i>
                        <span class="menu-title">Dashboard</span>
                    </a>
                </li>
                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon las la-ad"></i>
                        <span class="menu-title">Advertises </span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item ">
                                <a href="/advertise/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Advertises</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertise/price-plan" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Price Plan</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertise/type" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Add Type</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item ">
                                <a href="/advertise/cpc&amp;cpm" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">CPC & CPM</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertise/ip-log" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Ip Logs</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertise/blocked/ip-log" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Blocked Ip Log</span>
                                </a>
                            </li>

                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item ">
                    <a href="/keywords" class="nav-link">
                        <i class="menu-icon lab la-kickstarter-k"></i>
                        <span class="menu-title">Manage Keywords</span>
                    </a>
                </li>


                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon lab la-autoprefixer"></i>
                        <span class="menu-title">Manage Advertiser</span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Advertiser</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/active/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Active Advertiser</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/banned/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Banned Advertiser</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/email-unverified" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Email Unverified</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/sms-unverified" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">SMS Unverified</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/advertiser/send-email" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Send Email to all</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon lab la-chromecast"></i>
                        <span class="menu-title">Manage Publisher</span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item ">
                                <a href="/publisher/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Publisher</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/active/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Active Publisher</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/banned/all" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Banned Publishers</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/email-unverified" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Email Unverified</span>
                                                                        <span
                                        class="menu-badge pill bg--primary ml-auto">2</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/sms-unverified" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">SMS Unverified</span>
                                                                        <span
                                        class="menu-badge pill bg--primary ml-auto">4</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/send-email" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Send Email to all</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>


                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon las la-check-circle"></i>
                        <span class="menu-title">Manage Domain</span>
                                            </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item ">
                                <a href="/domain/pending" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Pending Domain</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/domain/approved" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Approved Domain</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon las la-credit-card"></i>
                        <span class="menu-title">Payment Gateways</span>

                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item  ">
                                <a href="/gateway/automatic" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Automatic Gateways</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="/gateway/manual" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Manual Gateways</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon las la-credit-card"></i>
                        <span class="menu-title">Deposits</span>
                                            </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item  ">
                                <a href="/deposit/pending" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Pending Deposits</span>
                                                                    </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/deposit/approved" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Approved Deposits</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/deposit/successful" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Successful Deposits</span>
                                </a>
                            </li>


                            <li class="sidebar-menu-item  ">
                                <a href="/deposit/rejected" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Rejected Deposits</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/deposit" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Deposits</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-bank"></i>
                        <span class="menu-title">Withdrawals </span>
                                            </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item ">
                                <a href="/withdraw/method" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Withdraw Methods</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/withdraw/pending" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Pending Log</span>

                                                                    </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/withdraw/approved" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Approved Log</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/withdraw/rejected" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Rejected Log</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="/withdraw/log" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Withdrawals Log</span>
                                </a>
                            </li>


                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="side-menu--open">
                        <i class="menu-icon la la-ticket"></i>
                        <span class="menu-title">Support Ticket </span>
                                                    <span class="menu-badge pill bg--primary ml-auto">
                                <i class="fa fa-exclamation"></i>
                            </span>
                                            </a>
                    <div class="sidebar-submenu sidebar-submenu__open ">
                        <ul>

                            <li class="sidebar-menu-item  ">
                                <a href="/tickets" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">All Ticket</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="/tickets/pending" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Pending Ticket</span>
                                                                            <span
                                            class="menu-badge pill bg--primary ml-auto">2</span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="/tickets/closed" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Closed Ticket</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item active ">
                                <a href="/tickets/answered" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Answered Ticket</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>


                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-list"></i>
                        <span class="menu-title">Report </span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>
                            <li class="sidebar-menu-item ">
                                <a href="/report/publishers/earning-logs" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Publishers Earning Log</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/report/transaction/advertisers" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Advertisers TRX Log</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item ">
                                <a href="/report/login/history" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Login History</span>
                                </a>
                            </li>

                        </ul>
                    </div>
                </li>




                <li class="sidebar__menu-header">Settings</li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/general-setting" class="nav-link">
                        <i class="menu-icon las la-life-ring"></i>
                        <span class="menu-title">General Setting</span>
                    </a>
                </li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/setting/logo-icon" class="nav-link">
                        <i class="menu-icon las la-images"></i>
                        <span class="menu-title">Logo Icon Setting</span>
                    </a>
                </li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/extensions" class="nav-link">
                        <i class="menu-icon las la-cogs"></i>
                        <span class="menu-title">Extensions</span>
                    </a>
                </li>

                <li class="sidebar-menu-item  ">
                    <a href="https://adjuction.in/admin/language" class="nav-link"
                       data-default-url="https://adjuction.in/admin/language">
                        <i class="menu-icon las la-language"></i>
                        <span class="menu-title">Language </span>
                    </a>
                </li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/seo" class="nav-link">
                        <i class="menu-icon las la-globe"></i>
                        <span class="menu-title">SEO Manager</span>
                    </a>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-envelope-o"></i>
                        <span class="menu-title">Email Manager</span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>

                            <li class="sidebar-menu-item  ">
                                <a href="https://adjuction.in/admin/email-template/global" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Global Template</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="https://adjuction.in/admin/email-template/index" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Email Templates</span>
                                </a>
                            </li>

                            <li class="sidebar-menu-item  ">
                                <a href="https://adjuction.in/admin/email-template/setting" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Email Configure</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-mobile"></i>
                        <span class="menu-title">SMS Manager</span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>
                            <li class="sidebar-menu-item  ">
                                <a href="https://adjuction.in/admin/sms-template/global" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">API Setting</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="https://adjuction.in/admin/sms-template/index" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">SMS Templates</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>


                <li class="sidebar__menu-header">Frontend Manager</li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/frontend/templates" class="nav-link ">
                        <i class="menu-icon la la-html5"></i>
                        <span class="menu-title">Manage Templates</span>
                    </a>
                </li>

                <li class="sidebar-menu-item ">
                    <a href="https://adjuction.in/admin/frontend/manage-pages" class="nav-link ">
                        <i class="menu-icon la la-list"></i>
                        <span class="menu-title">Manage Pages</span>
                    </a>
                </li>

                <li class="sidebar-menu-item sidebar-dropdown">
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-html5"></i>
                        <span class="menu-title">Manage Section</span>
                    </a>
                    <div class="sidebar-submenu  ">
                        <ul>
                                                                                                                            <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/banner" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Banner Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/benefits" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Benefits Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/blog" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Manage Blog</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/brands" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Brands Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/breadcrumb" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Breadcrumb</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/contact" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Contact Page</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/features" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Feature Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/footer" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Footer Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/format" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Advertise Format</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/login" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Login &amp; Reg. Image</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/overview" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Overview Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/policy" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Policy &amp; Terms</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/testimonial" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Testimonial Section</span>
                                        </a>
                                    </li>
                                                                                                                                <li class="sidebar-menu-item   ">
                                        <a href="https://adjuction.in/admin/frontend/frontend-sections/whychooseUs" class="nav-link">
                                            <i class="menu-icon las la-dot-circle"></i>
                                            <span class="menu-title">Why Choose Us</span>
                                        </a>
                                    </li>
                                                                                    </ul>
                    </div>
                </li>
            </ul>
            <div class="text-center mb-3 text-uppercase">
                <span class="text--primary">AdsRock</span>
                <span class="text--success">V1.1 </span>
            </div>
        </div>

    </div>

</div>
<!-- sidebar end -->
        <!-- navbar-wrapper start -->
<nav class="navbar-wrapper">
    <form class="navbar-search" onsubmit="return false;">
        <button type="submit" class="navbar-search__btn">
            <i class="las la-search"></i>
        </button>
        <input type="search" name="navbar-search__field" id="navbar-search__field"
               placeholder="Search...">
        <button type="button" class="navbar-search__close"><i class="las la-times"></i></button>

        <div id="navbar_search_result_area">
            <ul class="navbar_search_result"></ul>
        </div>
    </form>

    <div class="navbar__left">
        <button class="res-sidebar-open-btn"><i class="las la-bars"></i></button>
        <button type="button" class="fullscreen-btn">
            <i class="fullscreen-open las la-compress" onclick="openFullscreen();"></i>
            <i class="fullscreen-close las la-compress-arrows-alt" onclick="closeFullscreen();"></i>
        </button>
    </div>

    <div class="navbar__right">
        <ul class="navbar__action-list">
            <li>
                <button type="button" class="navbar-search__btn-open">
                    <i class="las la-search"></i>
                </button>
            </li>


            <li class="dropdown">
                <button type="button" class="" data-toggle="dropdown" data-display="static" aria-haspopup="true"
                        aria-expanded="false">


          <span class="navbar-user">
            <span class="navbar-user__thumb"><img
                    src="images/profile/617ed8a4eb19e1635702948.jpg"
                    alt="image"></span>

            <span class="navbar-user__info">
              <span class="navbar-user__name">admin</span>
            </span>
            <span class="icon"><i class="las la-chevron-circle-down"></i></span>
          </span>
                </button>
                <div class="dropdown-menu dropdown-menu--sm p-0 border-0 box--shadow1 dropdown-menu-right">
                                            <a href="/profile"
                           class="dropdown-menu__item d-flex align-items-center px-3 py-2">
                            <i class="dropdown-menu__icon las la-user-circle"></i>
                            <span class="dropdown-menu__caption">Profile</span>
                        </a>
                    
                                            <a href="/password"
                           class="dropdown-menu__item d-flex align-items-center px-3 py-2">
                            <i class="dropdown-menu__icon las la-key"></i>
                            <span class="dropdown-menu__caption">Password</span>
                        </a>
                    
                                            <a href="/logout"
                           class="dropdown-menu__item d-flex align-items-center px-3 py-2">
                            <i class="dropdown-menu__icon las la-sign-out-alt"></i>
                            <span class="dropdown-menu__caption">Logout</span>
                        </a>
                                    </div>
            </li>
        </ul>
    </div>
</nav>
<!-- navbar-wrapper end -->

        <div class="body-wrapper">
            <div class="bodywrapper__inner">
                <div class="row align-items-center mb-30 justify-content-between">
    <div class="col-lg-6 col-sm-6">
        <h6 class="page-title">Support Tickets</h6>
    </div>
    <div class="col-lg-6 col-sm-6 text-sm-right mt-sm-0 mt-3 right-part">
            <a href="/tickets" class="btn btn-sm btn--primary box--shadow1 text--small"><i class="la la-fw la-backward"></i> Go Back </a>
    </div>
</div>
                    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body ">
                    <h6 class="card-title  mb-4">
                        <div class="row">
                            <div class="col-sm-8 col-md-6">
                                                                    <span class="text--small badge font-weight-normal bg--success py-1 px-2">Open</span>
                                                                	[${ticketView.subject}]
                            </div>
                            <div class="col-sm-4  col-md-6 text-sm-right mt-sm-0 mt-3">

                                <button class="btn btn--danger btn-sm" type="button" data-toggle="modal"
                                        data-target="#DelModal">
                                    <i class="fa fa-lg fa-times-circle"></i> CLose Ticket                                </button>
                            </div>
                        </div>
                    </h6>


                    <form action="/ticket/reply/${id}" enctype="multipart/form-data" method="post" class="form-horizontal">
                        <input type="hidden" name="_token" value="82Sza2rjMd8IHohV7BkO7s4rANcxviYy3XPo4plI">                      

                        <div class="row ">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <textarea class="form-control" name="message" rows="3" id="inputMessage" placeholder="Your Message ..."></textarea>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="row form-group">
                                    <div class="col-md-12">
                                        <label for="inputAttachments">Attachments</label>
                                    </div>
                                    <div class="col-9 ">
                                        <div class="file-upload-wrapper" data-text="Select your file!">
                                            <input type="file" name="attachments[]" id="inputAttachments"
                                            class="file-upload-field"/>
                                        </div>
                                        <div id="fileUploadsContainer"></div>
                                    </div>
                                    <div class="col-3">
                                        <button type="button" class="btn btn--dark"
                                                onclick="extraTicketAttachment()"><i
                                                class="fa fa-plus"></i></button>
                                    </div>
                                    <div class="col-md-12 ticket-attachments-message text-muted mt-3">
                                        Allowed File Extensions: .jpg, .jpeg, .png, .pdf,
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 offset-md-3">
                                <button class="btn btn--primary btn-block mt-4" type="submit" name="replayTicket"
                                        value="1"><i class="la la-fw la-lg la-reply"></i> Reply                                </button>
                            </div>
                        </div>
                    </form>

                                            
                            <div class="row border border-primary border-radius-3 my-3 mx-2">

                                <div class="col-md-3 border-right text-right">
                                    <h5 class="my-3">Advertiser</h5>
                                                                            <a href="https://adjuction.in/admin/publisher/details/8"> Advertiser</a>
                                                                            <button data-id="6" type="button" data-toggle="modal" data-target="#DelMessage" class="btn btn-danger btn-sm my-3 delete-message"><i class="la la-trash"></i> Delete</button>
                                </div>

                                <div class="col-md-9">
                                    <p class="text-muted font-weight-bold my-3">
                                        Posted on Saturday, 06th November 2021 @ 16:06</p>
                                    <p>Fun to check</p>
                                                                    </div>

                            </div>

                                            
                </div>
            </div>
        </div>
    </div>




    <div class="modal fade" id="DelModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title"> Close Support Ticket!</h5>
                    <button type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">
                    <strong>Are you  want to Close This Support Ticket?</strong>
                </div>
                <div class="modal-footer">
                    <form method="post" action="/ticket/reply/${id}">
                        <input type="hidden" name="_token" value="82Sza2rjMd8IHohV7BkO7s4rANcxviYy3XPo4plI">                        <button type="button" class="btn btn--secondary" data-dismiss="modal">No </button>
                        <button type="submit" class="btn btn--success" name="replayTicket" value="2"> Close Ticket </button>
                    </form>
                </div>

            </div>
        </div>
    </div>



    <div class="modal fade" id="DelMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Reply</h4>
                    <button type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">
                    <strong>Are you sure to delete this?</strong>
                </div>
                <div class="modal-footer">
                    <form method="post" action="/ticket/delete">
                        <input type="hidden" name="_token" value="82Sza2rjMd8IHohV7BkO7s4rANcxviYy3XPo4plI">                        <input type="hidden" name="message_id" class="message_id">
                        <button type="button" class="btn btn--secondary" data-dismiss="modal">No </button>
                        <button type="submit" class="btn btn--danger"><i class="fa fa-trash"></i> Delete </button>
                    </form>
                </div>

            </div>
        </div>
    </div>
            </div><!-- bodywrapper__inner end -->
        </div><!-- body-wrapper end -->
    </div>





<!-- jQuery library -->
<script src="js/vendor/jquery-3.5.1.min.js"></script>
<!-- bootstrap js -->
<script src="js/vendor/bootstrap.bundle.min.js"></script>
<!-- bootstrap-toggle js -->
<script src="js/vendor/bootstrap-toggle.min.js"></script>

<!-- slimscroll js for custom scrollbar -->
<script src="js/vendor/jquery.slimscroll.min.js"></script>
<!-- custom select box js -->
<script src="js/vendor/jquery.nice-select.min.js"></script>


<link rel="stylesheet" href="css/iziToast.min.css">
<script src="js/iziToast.min.js"></script>

<script>
"use strict";
    function notify(status,message) {
        iziToast[status]({
            message: message,
            position: "topRight"
        });
    }
</script>

<script src="js/nicEdit.js"></script>

<!-- code preview js -->
<script src="js/vendor/prism.js"></script>
<!-- seldct 2 js -->
<script src="js/vendor/select2.min.js"></script>
<!-- main js -->
<script src="js/app.js"></script>


<script>
    (function($,document){
        "use strict";
        bkLib.onDomLoaded(function() {
            $( ".nicEdit" ).each(function( index ) {
                $(this).attr("id","nicEditor"+index);
                new nicEditor({fullPanel : false}).panelInstance('nicEditor'+index,{hasPanel : true});
            });
        });
        $( document ).on('mouseover ', '.nicEdit-main,.nicEdit-panelContain',function(){
            $('.nicEdit-main').focus();
        });
    })(jQuery, document);
</script>

    <script>
        'use strict';
        $(document).ready(function () {
            $('.delete-message').on('click', function (e) {
                $('.message_id').val($(this).data('id'));
            })
        });
        function extraTicketAttachment() {
            $("#fileUploadsContainer").append(`
            <div class="file-upload-wrapper" data-text="Select your file!"><input type="file" name="attachments[]" id="inputAttachments" class="file-upload-field"/></div>`)
        }
        
    </script>


</body>
</html>