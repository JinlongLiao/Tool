package com.xwintop.xJavaFxTool.view.debugTools;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.util.Map;

/**
 * @ClassName: SocketToolView
 * @Description: Socket调试工具
 * @author: xufeng
 * @date: 2018/4/24 16:45
 */

public abstract class SocketToolView implements Initializable {
    @FXML
    protected ComboBox<String> serverTcpUrlComboBox;
    @FXML
    protected TextField serverTcpPortTextField;
    @FXML
    protected Button serverTcpListenButton;
    @FXML
    protected ComboBox<String> serverUdpUrlComboBox;
    @FXML
    protected TextField serverUdpPortTextField;
    @FXML
    protected Button serverUdpListenButton;
    @FXML
    protected TableView<Map<String, String>> serverConnectTableView;
    @FXML
    protected TableColumn<Map<String, String>, String> serverConnectTableColumn;
    @FXML
    protected TextField serverDataSend1TextField;
    @FXML
    protected Button serverDataSend1Button;
    @FXML
    protected TextField serverDataSend2TextField;
    @FXML
    protected Button serverDataSend2Button;
    @FXML
    protected TextField serverDataSend3TextField;
    @FXML
    protected Button serverDataSend3Button;
    @FXML
    protected Button serverClearLogButton;
    @FXML
    protected TextArea serverLogTextArea;
    @FXML
    protected ComboBox<String> clientUrlComboBox;
    @FXML
    protected TextField clientPortTextField;
    @FXML
    protected Button clientTcpConnectButton;
    @FXML
    protected Button clientUdpConnectButton;
    @FXML
    protected TextField clientDataSend1TextField;
    @FXML
    protected Button clientDataSend1Button;
    @FXML
    protected TextField clientDataSend2TextField;
    @FXML
    protected Button clientDataSend2Button;
    @FXML
    protected TextField clientDataSend3TextField;
    @FXML
    protected Button clientDataSend3Button;
    @FXML
    protected Button clientClearLogButton;
    @FXML
    protected TextArea clientLogTextArea;
    @FXML
    protected CheckBox enableAutoReplyCheckBox;
    @FXML
    protected ChoiceBox<String> autoReplyTypeChoiceBox;
    @FXML
    protected TextField autoReplyTextField;
    @FXML
    protected CheckBox serverIsUseSslCheckBox;
    @FXML
    protected TextField serverKeyStorePathTextField;
    @FXML
    protected PasswordField serverKeyStorePasswordTextField;
    @FXML
    protected TextField serverTrustStoreTextField;
    @FXML
    protected PasswordField serverTrustStorePasswordTextField;
    @FXML
    protected CheckBox clientIsUseSslCheckBox;
    @FXML
    protected TextField clientKeyStorePathTextField;
    @FXML
    protected PasswordField clientKeyStorePasswordTextField;
    @FXML
    protected TextField clientTrustStoreTextField;
    @FXML
    protected PasswordField clientTrustStorePasswordTextField;

    public ComboBox<String> getServerTcpUrlComboBox() {
        return this.serverTcpUrlComboBox;
    }

    public TextField getServerTcpPortTextField() {
        return this.serverTcpPortTextField;
    }

    public Button getServerTcpListenButton() {
        return this.serverTcpListenButton;
    }

    public ComboBox<String> getServerUdpUrlComboBox() {
        return this.serverUdpUrlComboBox;
    }

    public TextField getServerUdpPortTextField() {
        return this.serverUdpPortTextField;
    }

    public Button getServerUdpListenButton() {
        return this.serverUdpListenButton;
    }

    public TableView<Map<String, String>> getServerConnectTableView() {
        return this.serverConnectTableView;
    }

    public TableColumn<Map<String, String>, String> getServerConnectTableColumn() {
        return this.serverConnectTableColumn;
    }

    public TextField getServerDataSend1TextField() {
        return this.serverDataSend1TextField;
    }

    public Button getServerDataSend1Button() {
        return this.serverDataSend1Button;
    }

    public TextField getServerDataSend2TextField() {
        return this.serverDataSend2TextField;
    }

    public Button getServerDataSend2Button() {
        return this.serverDataSend2Button;
    }

    public TextField getServerDataSend3TextField() {
        return this.serverDataSend3TextField;
    }

    public Button getServerDataSend3Button() {
        return this.serverDataSend3Button;
    }

    public Button getServerClearLogButton() {
        return this.serverClearLogButton;
    }

    public TextArea getServerLogTextArea() {
        return this.serverLogTextArea;
    }

    public ComboBox<String> getClientUrlComboBox() {
        return this.clientUrlComboBox;
    }

    public TextField getClientPortTextField() {
        return this.clientPortTextField;
    }

    public Button getClientTcpConnectButton() {
        return this.clientTcpConnectButton;
    }

    public Button getClientUdpConnectButton() {
        return this.clientUdpConnectButton;
    }

    public TextField getClientDataSend1TextField() {
        return this.clientDataSend1TextField;
    }

    public Button getClientDataSend1Button() {
        return this.clientDataSend1Button;
    }

    public TextField getClientDataSend2TextField() {
        return this.clientDataSend2TextField;
    }

    public Button getClientDataSend2Button() {
        return this.clientDataSend2Button;
    }

    public TextField getClientDataSend3TextField() {
        return this.clientDataSend3TextField;
    }

    public Button getClientDataSend3Button() {
        return this.clientDataSend3Button;
    }

    public Button getClientClearLogButton() {
        return this.clientClearLogButton;
    }

    public TextArea getClientLogTextArea() {
        return this.clientLogTextArea;
    }

    public CheckBox getEnableAutoReplyCheckBox() {
        return this.enableAutoReplyCheckBox;
    }

    public ChoiceBox<String> getAutoReplyTypeChoiceBox() {
        return this.autoReplyTypeChoiceBox;
    }

    public TextField getAutoReplyTextField() {
        return this.autoReplyTextField;
    }

    public CheckBox getServerIsUseSslCheckBox() {
        return this.serverIsUseSslCheckBox;
    }

    public TextField getServerKeyStorePathTextField() {
        return this.serverKeyStorePathTextField;
    }

    public PasswordField getServerKeyStorePasswordTextField() {
        return this.serverKeyStorePasswordTextField;
    }

    public TextField getServerTrustStoreTextField() {
        return this.serverTrustStoreTextField;
    }

    public PasswordField getServerTrustStorePasswordTextField() {
        return this.serverTrustStorePasswordTextField;
    }

    public CheckBox getClientIsUseSslCheckBox() {
        return this.clientIsUseSslCheckBox;
    }

    public TextField getClientKeyStorePathTextField() {
        return this.clientKeyStorePathTextField;
    }

    public PasswordField getClientKeyStorePasswordTextField() {
        return this.clientKeyStorePasswordTextField;
    }

    public TextField getClientTrustStoreTextField() {
        return this.clientTrustStoreTextField;
    }

    public PasswordField getClientTrustStorePasswordTextField() {
        return this.clientTrustStorePasswordTextField;
    }

    public void setServerTcpUrlComboBox(ComboBox<String> serverTcpUrlComboBox) {
        this.serverTcpUrlComboBox = serverTcpUrlComboBox;
    }

    public void setServerTcpPortTextField(TextField serverTcpPortTextField) {
        this.serverTcpPortTextField = serverTcpPortTextField;
    }

    public void setServerTcpListenButton(Button serverTcpListenButton) {
        this.serverTcpListenButton = serverTcpListenButton;
    }

    public void setServerUdpUrlComboBox(ComboBox<String> serverUdpUrlComboBox) {
        this.serverUdpUrlComboBox = serverUdpUrlComboBox;
    }

    public void setServerUdpPortTextField(TextField serverUdpPortTextField) {
        this.serverUdpPortTextField = serverUdpPortTextField;
    }

    public void setServerUdpListenButton(Button serverUdpListenButton) {
        this.serverUdpListenButton = serverUdpListenButton;
    }

    public void setServerConnectTableView(TableView<Map<String, String>> serverConnectTableView) {
        this.serverConnectTableView = serverConnectTableView;
    }

    public void setServerConnectTableColumn(TableColumn<Map<String, String>, String> serverConnectTableColumn) {
        this.serverConnectTableColumn = serverConnectTableColumn;
    }

    public void setServerDataSend1TextField(TextField serverDataSend1TextField) {
        this.serverDataSend1TextField = serverDataSend1TextField;
    }

    public void setServerDataSend1Button(Button serverDataSend1Button) {
        this.serverDataSend1Button = serverDataSend1Button;
    }

    public void setServerDataSend2TextField(TextField serverDataSend2TextField) {
        this.serverDataSend2TextField = serverDataSend2TextField;
    }

    public void setServerDataSend2Button(Button serverDataSend2Button) {
        this.serverDataSend2Button = serverDataSend2Button;
    }

    public void setServerDataSend3TextField(TextField serverDataSend3TextField) {
        this.serverDataSend3TextField = serverDataSend3TextField;
    }

    public void setServerDataSend3Button(Button serverDataSend3Button) {
        this.serverDataSend3Button = serverDataSend3Button;
    }

    public void setServerClearLogButton(Button serverClearLogButton) {
        this.serverClearLogButton = serverClearLogButton;
    }

    public void setServerLogTextArea(TextArea serverLogTextArea) {
        this.serverLogTextArea = serverLogTextArea;
    }

    public void setClientUrlComboBox(ComboBox<String> clientUrlComboBox) {
        this.clientUrlComboBox = clientUrlComboBox;
    }

    public void setClientPortTextField(TextField clientPortTextField) {
        this.clientPortTextField = clientPortTextField;
    }

    public void setClientTcpConnectButton(Button clientTcpConnectButton) {
        this.clientTcpConnectButton = clientTcpConnectButton;
    }

    public void setClientUdpConnectButton(Button clientUdpConnectButton) {
        this.clientUdpConnectButton = clientUdpConnectButton;
    }

    public void setClientDataSend1TextField(TextField clientDataSend1TextField) {
        this.clientDataSend1TextField = clientDataSend1TextField;
    }

    public void setClientDataSend1Button(Button clientDataSend1Button) {
        this.clientDataSend1Button = clientDataSend1Button;
    }

    public void setClientDataSend2TextField(TextField clientDataSend2TextField) {
        this.clientDataSend2TextField = clientDataSend2TextField;
    }

    public void setClientDataSend2Button(Button clientDataSend2Button) {
        this.clientDataSend2Button = clientDataSend2Button;
    }

    public void setClientDataSend3TextField(TextField clientDataSend3TextField) {
        this.clientDataSend3TextField = clientDataSend3TextField;
    }

    public void setClientDataSend3Button(Button clientDataSend3Button) {
        this.clientDataSend3Button = clientDataSend3Button;
    }

    public void setClientClearLogButton(Button clientClearLogButton) {
        this.clientClearLogButton = clientClearLogButton;
    }

    public void setClientLogTextArea(TextArea clientLogTextArea) {
        this.clientLogTextArea = clientLogTextArea;
    }

    public void setEnableAutoReplyCheckBox(CheckBox enableAutoReplyCheckBox) {
        this.enableAutoReplyCheckBox = enableAutoReplyCheckBox;
    }

    public void setAutoReplyTypeChoiceBox(ChoiceBox<String> autoReplyTypeChoiceBox) {
        this.autoReplyTypeChoiceBox = autoReplyTypeChoiceBox;
    }

    public void setAutoReplyTextField(TextField autoReplyTextField) {
        this.autoReplyTextField = autoReplyTextField;
    }

    public void setServerIsUseSslCheckBox(CheckBox serverIsUseSslCheckBox) {
        this.serverIsUseSslCheckBox = serverIsUseSslCheckBox;
    }

    public void setServerKeyStorePathTextField(TextField serverKeyStorePathTextField) {
        this.serverKeyStorePathTextField = serverKeyStorePathTextField;
    }

    public void setServerKeyStorePasswordTextField(PasswordField serverKeyStorePasswordTextField) {
        this.serverKeyStorePasswordTextField = serverKeyStorePasswordTextField;
    }

    public void setServerTrustStoreTextField(TextField serverTrustStoreTextField) {
        this.serverTrustStoreTextField = serverTrustStoreTextField;
    }

    public void setServerTrustStorePasswordTextField(PasswordField serverTrustStorePasswordTextField) {
        this.serverTrustStorePasswordTextField = serverTrustStorePasswordTextField;
    }

    public void setClientIsUseSslCheckBox(CheckBox clientIsUseSslCheckBox) {
        this.clientIsUseSslCheckBox = clientIsUseSslCheckBox;
    }

    public void setClientKeyStorePathTextField(TextField clientKeyStorePathTextField) {
        this.clientKeyStorePathTextField = clientKeyStorePathTextField;
    }

    public void setClientKeyStorePasswordTextField(PasswordField clientKeyStorePasswordTextField) {
        this.clientKeyStorePasswordTextField = clientKeyStorePasswordTextField;
    }

    public void setClientTrustStoreTextField(TextField clientTrustStoreTextField) {
        this.clientTrustStoreTextField = clientTrustStoreTextField;
    }

    public void setClientTrustStorePasswordTextField(PasswordField clientTrustStorePasswordTextField) {
        this.clientTrustStorePasswordTextField = clientTrustStorePasswordTextField;
    }
}
