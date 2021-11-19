<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- meta tags and other links -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AdkRive - Admin Dashboard</title>
    <!-- site favicon -->
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
  
	<script type="text/javascript">
	 
		function func(linkVal){
	    document.getElementById('vp').value =document.getElementById(btnId).getAttribute('svp');
	    
	    alert(document.getElementById('vp').value); 
	}
	</script>

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
                <li class="sidebar-menu-item active">
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
					<!-- NEWLY ADDED FEEDS OPTION START-->
							 <li class="sidebar-menu-item ">
                    <a href="/keywords" class="nav-link">
                       <i class="menu-icon fa fa-rss" style="font-size:16px;" aria-hidden="true"></i>
                        <span class="menu-title">Feeds</span>
                    </a>
                </li>
					<!--    FEEDS OPTION CLOSED -->
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
                                      <span class="menu-badge pill bg--primary ml-auto"><c:if test="${no_of_uve gt 0}">${no_of_uve}</c:if></span>
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item ">
                                <a href="/publisher/sms-unverified" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">SMS Unverified</span>
                                    <span class="menu-badge pill bg--primary ml-auto"><c:if test="${no_of_uvs gt 0}">${no_of_uvs}</c:if></span>
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
                    <a href="javascript:void(0)" class="">
                        <i class="menu-icon la la-ticket"></i>
                        <span class="menu-title">Support Ticket </span>
                                            </a>
                    <div class="sidebar-submenu  ">
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
                                                                    </a>
                            </li>
                            <li class="sidebar-menu-item  ">
                                <a href="/tickets/closed" class="nav-link">
                                    <i class="menu-icon las la-dot-circle"></i>
                                    <span class="menu-title">Closed Ticket</span>
                                </a>
                            </li>
                            <li class="sidebar-menu-item  ">
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
                    src="data:image/png;base64,${image}"></span>

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
        <h6 class="page-title">Admin Dashboard</h6>
    </div>
    <div class="col-lg-6 col-sm-6 text-sm-right mt-sm-0 mt-3 right-part">
            </div>
</div>
                            <div class="row mb-none-30">
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--primary b-radius--10 box-shadow">
                <div class="icon">
                    <i class="fa fa-users"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_Advertiser}</span>
                    </div>
                    <div class="desciption">
                        <span class="text--small">Total Advertiser</span>
                    </div>
                    <a href="/advertiser/all" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div><!-- dashboard-w1 end -->
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--success b-radius--10 box-shadow">
                <div class="icon">
                    <i class="fa fa-users"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_Publisher}</span><!-- Total no of publishers count -->
                    </div>
                    <div class="desciption">
                        <span class="text--small">Total Publisher</span>
                    </div>
                    <a href="/publisher/all" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div>
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--deep-purple b-radius--10 box-shadow ">
                <div class="icon">
                    <i class="la la-envelope"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_Advertises}</span>
                    </div>
                    <div class="desciption">
                        <span class="text--small">Total Advertises</span>
                    </div>

                    <a href="/advertise/all" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div><!-- dashboard-w1 end -->
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--warning b-radius--10 box-shadow ">
                <div class="icon">
                    <i class="fab fa-adn"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_AidType}</span>
                    </div>
                    <div class="desciption">
                        <span class="text--small">Total Ad Types</span>
                    </div>

                    <a href="/advertise/type" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div><!-- dashboard-w1 end -->


        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--17 b-radius--10 box-shadow" >
                <div class="icon">
                    <i class="fa fa-list"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_PricePlan}</span>
                    </div>
                    <div class="desciption">
                        <span>Total Price Plans</span>
                    </div>
                    <a href="/advertise/price-plan" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div>
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--16 b-radius--10 box-shadow" >
                <div class="icon">
                    <i class="fa fa-globe"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_ApprovedDomain} </span>

                    </div>
                    <div class="desciption">
                        <span>Total Approved Domains</span>
                    </div>
                    <a href="/domain/approved" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div>
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--1 b-radius--10 box-shadow" >
                <div class="icon">
                    <i class="fa fa-globe"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">${total_PendingDomain}</span>

                    </div>
                    <div class="desciption">
                        <span>Total Pending Domains</span>
                    </div>
                    <a href="/domain/pending" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div>
        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--15 b-radius--10 box-shadow" >
                <div class="icon">
                    <i class="fas fa-hand-point-up"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">0</span>

                    </div>
                    <div class="desciption">
                        <span>Total Clicked</span>
                    </div>
                    <a href="/advertise/all" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
        </div>

        <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
            <div class="dashboard-w1 bg--13 b-radius--10 box-shadow" >
                <div class="icon">
                    <i class="fas fa-eye"></i>
                </div>
                <div class="details">
                    <div class="numbers">
                        <span class="amount">0</span>
                    </div>
                    <div class="desciption">
                        <span>Total Impressions</span>
                    </div>
                    <a href="/advertise/all" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                </div>
            </div>
         </div>

            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--indigo b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fa fa-wallet"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">${total_WithdrawMethod}</span>
                        </div>
                        <div class="desciption">
                            <span>Withdraw Method</span>
                        </div>
                        <a href="/withdraw/method" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                    </div>
                </div>
            </div>


            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--purple b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fa fa-hand-holding-usd"></i>
                    </div>
                     <div class="details">
                        <div class="numbers">
                            <span class="amount">${total_Withdraw}</span>
                            <span class="currency-sign">INR</span>
                        </div>
                        <div class="desciption">
                            <span>Total Withdraw</span>
                        </div>
                        <a href="/withdraw/approved" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                    </div>
                </div>
            </div>


            <div class="col-xl-3 col-lg-6 col-sm-4 mb-30">
                <div class="dashboard-w1 bg--teal b-radius--10 box-shadow">
                    <div class="icon">
                        <i class="fa fa-spinner"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">${total_WithdrawPending}</span>
                        </div>
                        <div class="desciption">
                            <span>Withdraw Pending</span>
                        </div>

                        <a href="/withdraw/pending" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                    </div>
                </div>
            </div>

            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--brown b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fa fa-money-bill-alt"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">${total_WithdrawApproved}</span>
                        </div>
                        <div class="desciption">
                            <span>Withdraw Approved</span>
                        </div>
                        <a href="/withdraw/approved" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                    </div>
                </div>
            </div>

            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--12 b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fa fa-money-bill-alt"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">0.08 </span>
                            <span class="currency-sign">${currenSigncyCpc}</span>
                        </div>
                        <div class="desciption">
                            <span>Current CPC</span>
                        </div>
                        <a href="https://adjuction.in/admin/advertise/cpc&amp;cpm" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View</a>
                    </div>
                </div>
            </div>

            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--8 b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fa fa-money-bill-alt"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">0.02 </span>
                            <span class="currency-sign">${currenSigncyCpm}</span>
                        </div>
                        <div class="desciption">
                            <span>Current CPM</span>
                        </div>
                        <a href="https://adjuction.in/admin/advertise/cpc&amp;cpm" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View</a>
                    </div>
                </div>
            </div>

            <div class="col-xl-3 col-lg-4 col-sm-6 mb-30">
                <div class="dashboard-w1 bg--19 b-radius--10 box-shadow" >
                    <div class="icon">
                        <i class="fas fa-ticket-alt"></i>
                    </div>
                    <div class="details">
                        <div class="numbers">
                            <span class="amount">${total_PendingTicket}</span>
                        </div>
                        <div class="desciption">
                            <span>Total Pending Tickets</span>
                        </div>
                        <a href="/tickets/pending" class="btn btn-sm text--small bg--white text--black box--shadow3 mt-3">View All</a>
                    </div>
                </div>
            </div>
          </div><!-- row end-->


    <div class="row mt-50 mb-none-30">
        <div class="col-xl-6 mb-30">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Monthly  Deposit & Withdraw  Report</h5>
                    <div id="apex-bar-chart"> </div>
                </div>
            </div>
        </div>
        <div class="col-xl-6 mb-30">
            <div class="row mb-none-30">
                <div class="col-lg-6 col-sm-6 mb-30">
                    <div class="widget-three box--shadow2 b-radius--5 bg--white">
                        <div class="widget-three__icon b-radius--rounded bg--primary box--shadow2">
                            <i class="las la-wallet "></i>
                        </div>
                        <div class="widget-three__content">
                            <h2 class="numbers">22</h2>
                            <p  class="text--small">Total Payment Method</p>
                        </div>
                    </div><!-- widget-two end -->
                </div>
                <div class="col-lg-6 col-sm-6 mb-30">
                    <div class="widget-three box--shadow2 b-radius--5 bg--white">
                        <div class="widget-three__icon b-radius--rounded bg--pink  box--shadow2">
                            <i class="las la-money-bill "></i>
                        </div>
                        <div class="widget-three__content">
                            <h2 class="numbers">0 USD</h2>
                            <p class="text--small">Total Deposit</p>
                        </div>
                    </div><!-- widget-two end -->
                </div>
                <div class="col-lg-6 col-sm-6 mb-30">
                    <div class="widget-three box--shadow2 b-radius--5 bg--white">
                        <div class="widget-three__icon b-radius--rounded bg--teal box--shadow2">
                            <i class="las la-money-check"></i>
                        </div>
                        <div class="widget-three__content">
                            <h2 class="numbers">0 USD</h2>
                            <p class="text--small">Total Deposit Charge</p>
                        </div>
                    </div><!-- widget-two end -->
                </div>
                <div class="col-lg-6 col-sm-6 mb-30">
                    <div class="widget-three box--shadow2 b-radius--5 bg--white">
                        <div class="widget-three__icon b-radius--rounded bg--green  box--shadow2">
                            <i class="las la-money-bill-wave "></i>
                        </div>
                        <div class="widget-three__content">
                            <h2 class="numbers">0</h2>
                            <p class="text--small">Pending Deposit</p>
                        </div>
                    </div><!-- widget-two end -->
                </div>
            </div>
        </div>
    </div><!-- row end -->

    <div class="row mb-none-30 mt-5">
        <div class="col-xl-12 mb-30">
            <div class="card ">
                <div class="card-header">
                    <h6 class="card-title mb-0">Latest Transactions</h6>
                </div>
                <div class="card-body p-0">
                    <div class="table-responsive--sm table-responsive">
                        <table class="table table--light style--two">
                            <thead>
                            <tr>
                                <th scope="col">Date</th>
                                <th scope="col">TRX</th>

                                <th scope="col">Amount</th>
                                <th scope="col">Charge</th>
                                <th scope="col">Post Balance</th>
                                <th scope="col">Detail</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:choose>
                            		<c:when test="${empty advTxLog}">
                            		 <td class="text-muted text-center" colspan="100%">No Data</td>
                            		</c:when>
                            		
                            		<c:otherwise>
                            				<c:forEach items="${advTxLog}" var="element">
                            							
                            							
                            								<tr>
                                <td data-label="Date">${element.date}</td>
                                <td data-label="TRX" class="font-weight-bold">${element.trx}</td>
                                <td data-label="Username"><a href="/advertiser/details/${element.id}">${element.username}</a></td>
                                <td data-label="Amount" class="budget">
                                    <strong  class="text-success" > + ${element.amount} INR</strong>
                                </td>
                                <td data-label="Charge" class="budget">₹ ${element.charge} </td>
                                <td data-label="Post Balance">${element.post_balance} INR</td>
                                <td data-label="Detail">Added Balance Via Admin</td>
                            </tr>
                            						</c:forEach>
                            		</c:otherwise>
                            
                            </c:choose>
                                                           
                            
                            </tbody>
                        </table><!-- table end -->
                    </div>
                </div>
            </div><!-- card end -->
        </div>
    </div>

    <div class="row mb-none-30 mt-5">
        <div class="col-xl-4 col-lg-6 mb-30">
            <div class="card overflow-hidden">
                <div class="card-body">
                    <h5 class="card-title">Login By Browser</h5>
                    <canvas id="userBrowserChart"></canvas>
                </div>
            </div>
        </div>
        <div class="col-xl-4 col-lg-6 mb-30">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Login By OS</h5>
                    <canvas id="userOsChart"></canvas>
                </div>
            </div>
        </div>
        <div class="col-xl-4 col-lg-6 mb-30">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Login By Country</h5>
                    <canvas id="userCountryChart"></canvas>
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


    <script src="js/vendor/apexcharts.min.js"></script>
    <script src="js/vendor/chart.js.2.8.0.js"></script>

    <script>
        'use strict'
            // apex-bar-chart js
        var options = {
            series: [{
                name: 'Total Deposit',
                data: [
                                    ]
            }, {
                name: 'Total Withdraw',
                data: [
                                    ]
            }],
            chart: {
                type: 'bar',
                height: 400,
                toolbar: {
                    show: false
                }
            },
            plotOptions: {
                bar: {
                    horizontal: false,
                    columnWidth: '50%',
                    endingShape: 'rounded'
                },
            },
            dataLabels: {
                enabled: true
            },
            stroke: {
                show: true,
                width: 2,
                colors: ['transparent']
            },
            xaxis: {
                categories: [],
            },
            yaxis: {
                title: {
                    text: "$",
                    style: {
                        color: '#7c97bb'
                    }
                }
            },
            grid: {
                xaxis: {
                    lines: {
                        show: false
                    }
                },
                yaxis: {
                    lines: {
                        show: false
                    }
                },
            },
            fill: {
                opacity: 1
            },
            tooltip: {
                y: {
                    formatter: function (val) {
                        return "$" + val + " "
                    }
                }
            }
        };

            var chart = new ApexCharts(document.querySelector("#apex-bar-chart"), options);
            chart.render();

    </script>






 <script>

        var ctx = document.getElementById('userBrowserChart');
        var myChart = new Chart(ctx, {
            type: 'doughnut',
            data: {
                labels: [],
                datasets: [{
                    data: [],
                    backgroundColor: [
                        '#FF4500',
                        '#e52d27',
                        '#fba540',
                        '#e7505a',
                        '#5050bf',
                        '#8E44AD',
                        '#4f8a8b',
                        '#1f4068',
                        '#62760c',
                        '#be5683',
                        '#cf1b1b',
                        '#96bb7c',
                        '#d3de32',
                        '#e8505b',
                        '#24a19c',
                        '#3b6978',
                        '#b83b5e',
                        '#ff4301',
                        '#c4fb6d',
                        '#bac964',
                        '#fb7813',
                        '#3b6978',
                        '#f3c623',
                        '#127681',
                        '#562349',
                        '#1f4068',
                        '#035aa6',
                        '#95389e',
                        '#481380'
                    ],
                    borderColor: [
                        'rgba(231, 80, 90, 0.75)'
                    ],
                    borderWidth: 0,

                }]
            },
            options: {
                aspectRatio: 1,
                responsive: true,
                maintainAspectRatio: true,
                elements: {
                    line: {
                        tension: 0 // disables bezier curves
                    }
                },
                scales: {
                    xAxes: [{
                        display: false
                    }],
                    yAxes: [{
                        display: false
                    }]
                },
                legend: {
                    display: false,
                }
            }
        });



        var ctx = document.getElementById('userOsChart');
        var myChart = new Chart(ctx, {
            type: 'doughnut',
            data: {
                labels: [],
                datasets: [{
                    data: [],
                    backgroundColor: [
                        '#FF4500',
                        '#e52d27',
                        '#fba540',
                        '#e7505a',
                        '#5050bf',
                        '#8E44AD',
                        '#4f8a8b',
                        '#1f4068',
                        '#62760c',
                        '#be5683',
                        '#cf1b1b',
                        '#96bb7c',
                        '#d3de32',
                        '#e8505b',
                        '#24a19c',
                        '#3b6978',
                        '#b83b5e',
                        '#ff4301',
                        '#c4fb6d',
                        '#bac964',
                        '#fb7813',
                        '#3b6978',
                        '#f3c623',
                        '#127681',
                        '#562349',
                        '#1f4068',
                        '#035aa6',
                        '#95389e',
                        '#481380'

                    ],
                    borderColor: [
                        'rgba(0, 0, 0, 0.05)'
                    ],
                    borderWidth: 0,

                }]
            },
            options: {
                aspectRatio: 1,
                responsive: true,
                elements: {
                    line: {
                        tension: 0 // disables bezier curves
                    }
                },
                scales: {
                    xAxes: [{
                        display: false
                    }],
                    yAxes: [{
                        display: false
                    }]
                },
                legend: {
                    display: false,
                }
            },
        });


        //Donut chart
        var ctx = document.getElementById('userCountryChart');
        var myChart = new Chart(ctx, {
            type: 'doughnut',
            data: {
                labels: ["India"],
                datasets: [{
                    data: [2],
                    backgroundColor: [
                        '#FF4500',
                        '#e52d27',
                        '#fba540',
                        '#e7505a',
                        '#5050bf',
                        '#8E44AD',
                        '#4f8a8b',
                        '#1f4068',
                        '#62760c',
                        '#be5683',
                        '#cf1b1b',
                        '#96bb7c',
                        '#d3de32',
                        '#e8505b',
                        '#24a19c',
                        '#3b6978',
                        '#b83b5e',
                        '#ff4301',
                        '#c4fb6d',
                        '#bac964',
                        '#fb7813',
                        '#3b6978',
                        '#f3c623',
                        '#127681',
                        '#562349',
                        '#1f4068',
                        '#035aa6',
                        '#95389e',
                        '#481380',
                    ],
                    borderColor: [
                        'rgba(231, 80, 90, 0.75)'
                    ],
                    borderWidth: 3,

                }]
            },
            options: {
                aspectRatio: 1,
                responsive: true,
                elements: {
                    line: {
                        tension: 0 // disables bezier curves
                    }
                },
                scales: {
                    xAxes: [{
                        display: false
                    }],
                    yAxes: [{
                        display: false
                    }]
                },
                legend: {
                    display: false,
                }
            }
        });
</script>


</body>
</html>
