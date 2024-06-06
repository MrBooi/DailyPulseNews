//
//  AboutScreen.swift
//  iosApp
//
//  Created by Ayabonga Booi on 2024/06/06.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
      NavigationStack {
        AboutListView()
          .navigationTitle("About Device")
      }
    }
}

#Preview {
    AboutScreen()
}
