import {Component, OnInit} from '@angular/core';

declare interface RouteInfo {
  path: string;
  title: string;
  rtlTitle: string;
  icon: string;
  class: string;
}

export const ROUTES: RouteInfo[] = [
  {
    path: '/dashboard',
    title: 'Dashboard',
    rtlTitle: 'لوحة القيادة',
    icon: 'icon-chart-pie-36',
    class: ''
  },
  {
    path: '/icons',
    title: 'Users',
    rtlTitle: 'الرموز',
    icon: 'icon-single-02',
    class: ''
  },
  {
    path: '/company',
    title: 'Company',
    rtlTitle: 'خرائط',
    icon: 'icon-components',
    class: ''
  },
  {
    path: '/users',
    title: 'Customers and Suppliers',
    rtlTitle: 'إخطارات',
    icon: 'icon-link-72',
    class: ''
  },

  {
    path: '/products',
    title: 'Products and services',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: 'dropdown'
  },
  {
    path: '/products/create',
    title: 'Add product',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: 'dropdown-item'
  },
  {
    path: '/warehouses',
    title: 'Warehouses',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: 'dropdown'
  },
  {
    path: '/warehouses/create',
    title: 'add a warehouse',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: ''
  },
  {
    path: '/warehouses/replenishment',
    title: 'Replenishment',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: 'dropdown-item'
  },
  {
    path: '/warehouses/stock-movements',
    title: 'Stock movements',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: 'dropdown-item'
  },
  {
    path: '/tiers',
    title: 'Tiers',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: ''
  },
  {
    path: '/tiers/create',
    title: 'Add a tiers',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: ''
  },
  {
    path: '/tiers/suplier/create',
    title: 'Add a suplier',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: ''
  },
  {
    path: 'tiers/client/create',
    title: 'Add a client',
    rtlTitle: 'ملف تعريفي للمستخدم',
    icon: 'icon-bag-16',
    class: ''
  },
  {
    path: '/tables',
    title: 'Purshases',
    rtlTitle: 'قائمة الجدول',
    icon: 'icon-money-coins',
    class: ''
  },
  {
    path: '/typography',
    title: 'Sales',
    rtlTitle: 'طباعة',
    icon: 'icon-coins',
    class: ''
  },
  {
    path: '/typography',
    title: 'Financial Statements',
    rtlTitle: 'طباعة',
    icon: 'icon-bank',
    class: ''
  },
  {
    path: '/typography',
    title: 'Digital Marketing',
    rtlTitle: 'طباعة',
    icon: 'icon-chart-bar-32',
    class: ''
  },
  {
    path: '/typography',
    title: 'Reports',
    rtlTitle: 'طباعة',
    icon: 'icon-notes',
    class: ''
  },
  {
    path: '/typography',
    title: 'Setting',
    rtlTitle: 'طباعة',
    icon: 'icon-settings',
    class: ''
  },
  {
    path: '/typography',
    title: 'Support',
    rtlTitle: 'طباعة',
    icon: 'icon-support-17',
    class: ''
  },
  {
    path: '/rtl',
    title: 'RTL Support',
    rtlTitle: 'ار تي ال',
    icon: 'icon-world',
    class: ''
  }
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {
  menuItems: any[];

  constructor() {
  }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }

  isMobileMenu() {
    return window.innerWidth <= 991;

  }
}
