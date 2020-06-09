export class Menu {
  public static menu: Array<any> = [
    {
      oe: [
        { path: "oedashboard",title: "Dashboard", icon: "pe-7s-graph", class: ""  },
        { path: "loandetails",title: "Loan Details", icon: "pe-7s-graph", class: ""  }
      ],
      re: [{ path: "redashboard", title: "Dashboard", icon: "pe-7s-graph", class: "" }],
      admin: [
        { path: "admindashboard", title: "EasyEmi Admin", icon: "pe-7s-graph", class: "" },
        { path : "user", title: "User", icon: "pe-7s-graph", class: "" },
        { path : "branch", title: "Branch", icon: "pe-7s-graph", class: "" },
        { path : "address", title: "Address", icon: "pe-7s-graph", class: "" },
        { path : "payment", title: "Payment Method", icon: "pe-7s-graph", class: "" },
        { path : "status", title: "Status", icon: "pe-7s-graph", class: "" },
        { path : "role", title: "Role", icon: "pe-7s-graph", class: "" }
      ],
      bm: [{ path: "bmdashboard", title: "Dashboard", icon: "pe-7s-graph", class: ""  }],
      ah: [{ path: "ahdashboard", title: "Dashboard", icon: "pe-7s-graph", class: ""  }],
      cm: [{ path: "cmdashboard", title: "Dashboard", icon: "pe-7s-graph", class: ""  }]
    }
  ];
}
