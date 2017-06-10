package jem.imabw

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper
import org.jb2011.lnf.beautyeye.ch8_toolbar.BEToolBarUI
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.Font
import java.awt.Insets
import javax.swing.*
import javax.swing.plaf.BorderUIResource
import javax.swing.plaf.InsetsUIResource


fun main(args: Array<String>) {
    BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike
    UIManager.put("RootPane.setupButtonVisible", false)
    UIManager.put("TabbedPane.tabAreaInsets", InsetsUIResource(3, 20, 2, 20))
    UIManager.put("ToolBar.border",
            BorderUIResource(BEToolBarUI.ToolBarBorder(UIManager.getColor("ToolBar.shadow"), UIManager.getColor("ToolBar.highlight"), Insets(4, 0, 4, 0))))

    val DEFAULT_FONT = arrayOf("Table.font", "TableHeader.font", "CheckBox.font", "Tree.font", "Viewport.font", "ProgressBar.font", "RadioButtonMenuItem.font", "ToolBar.font", "ColorChooser.font", "ToggleButton.font", "Panel.font", "TextArea.font", "Menu.font", "TableHeader.font", "OptionPane.font", "MenuBar.font", "Button.font", "Label.font", "PasswordField.font", "ScrollPane.font", "MenuItem.font", "ToolTip.font", "List.font", "EditorPane.font", "Table.font", "TabbedPane.font", "RadioButton.font", "CheckBoxMenuItem.font", "TextPane.font", "PopupMenu.font", "TitledBorder.font", "ComboBox.font")// ,"TextField.font"
    val font = Font("Microsoft YaHei UI", Font.PLAIN, 14)
    for (n in DEFAULT_FONT) {
        UIManager.put(n, font)
    }
    BeautyEyeLNFHelper.launchBeautyEyeLNF()

    val frame = JFrame()
    val pane = frame.contentPane
    pane.add(JTextArea("Words"))
    pane.add(JButton("Ok"),BorderLayout.PAGE_END)
    frame.pack()
    frame.isVisible=true
}
