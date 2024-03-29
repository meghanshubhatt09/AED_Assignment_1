/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package carui;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import model.Car;
import java.io.File;
import javax.swing.ImageIcon;
import java.util.Set;
import javax.swing.JFileChooser;
import java.awt.Image;
import javax.swing.JOptionPane;

/**
 *
 * @author meghanshubhatt
 */
public class ViewJPanelCar extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanelCar
     */
    Car car;
    public String selectedImagePath;
    private ArrayList ls = new ArrayList();
    public ViewJPanelCar(Car car) {
        initComponents();
        this.car = car;
        displayProduct();
        addRowToTable();
        displayImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWarrantyYear = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblOwnerName = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtDrivingLicense = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblOwnerTelephoneNumber = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblEngineNo = new javax.swing.JLabel();
        lblCarPhoto = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblOwnerAddress = new javax.swing.JLabel();
        txtEngineNo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblTotalSeats = new javax.swing.JLabel();
        txtTotalSeats = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblServiceRecords = new javax.swing.JLabel();
        lblDrvingLicense = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblImageDisplay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(762, 482));

        lblWarrantyYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWarrantyYear.setText("Warranty Year:");

        lblModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModel.setText("Model:");

        txtBrand.setEditable(false);
        txtBrand.setBackground(new java.awt.Color(204, 204, 204));
        txtBrand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBrand.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOwnerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblOwnerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwnerName.setText("Owner Name:");

        txtModel.setEditable(false);
        txtModel.setBackground(new java.awt.Color(204, 204, 204));
        txtModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtModel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDrivingLicense.setEditable(false);
        txtDrivingLicense.setBackground(new java.awt.Color(204, 204, 204));
        txtDrivingLicense.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDrivingLicense.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtColor.setEditable(false);
        txtColor.setBackground(new java.awt.Color(204, 204, 204));
        txtColor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOwnerName.setEditable(false);
        txtOwnerName.setBackground(new java.awt.Color(204, 204, 204));
        txtOwnerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOwnerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEmailAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailAddress.setText("Owner Email Address:");

        lblColor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColor.setText("Color:");

        lblOwnerTelephoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblOwnerTelephoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwnerTelephoneNumber.setText("Owner Telephone Number:");

        lblSSN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSSN.setText("Owner SSN:");

        txtNumber.setEditable(false);
        txtNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYear.setText("Year:");

        lblPhoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPhoto.setText("Photo:");

        txtSSN.setEditable(false);
        txtSSN.setBackground(new java.awt.Color(204, 204, 204));
        txtSSN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSSN.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblEngineNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEngineNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEngineNo.setText("Engine No.:");

        lblCarPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carui/CarImage.png"))); // NOI18N

        txtYear.setEditable(false);
        txtYear.setBackground(new java.awt.Color(204, 204, 204));
        txtYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOwnerAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblOwnerAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwnerAddress.setText("Owner Address:");

        txtEngineNo.setEditable(false);
        txtEngineNo.setBackground(new java.awt.Color(204, 204, 204));
        txtEngineNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEngineNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("View Your Details ! :)");

        txtEmailAddress.setEditable(false);
        txtEmailAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTotalSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalSeats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalSeats.setText("Total Seat's:");

        txtTotalSeats.setEditable(false);
        txtTotalSeats.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalSeats.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblBrand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrand.setText("Brand:");

        lblLicensePlate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLicensePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLicensePlate.setText("License Plate:");

        txtLicensePlate.setEditable(false);
        txtLicensePlate.setBackground(new java.awt.Color(204, 204, 204));
        txtLicensePlate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLicensePlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblServiceRecords.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblServiceRecords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServiceRecords.setText("Service Records:");

        lblDrvingLicense.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDrvingLicense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrvingLicense.setText("Owner Driving License:");

        txtWarrantyYear.setEditable(false);
        txtWarrantyYear.setBackground(new java.awt.Color(204, 204, 204));
        txtWarrantyYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWarrantyYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "List"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        lblImageDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCarPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblEngineNo)
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblLicensePlate)
                            .addGap(9, 9, 9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblTotalSeats)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblYear)
                            .addGap(57, 57, 57))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBrand)
                                .addComponent(lblColor)
                                .addComponent(lblModel))
                            .addGap(48, 48, 48)))
                    .addComponent(lblWarrantyYear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEngineNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOwnerName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOwnerTelephoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailAddress)
                                    .addComponent(lblDrvingLicense)
                                    .addComponent(lblSSN)
                                    .addComponent(lblOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblServiceRecords))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addComponent(lblImageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCarPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDrvingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoto))
                        .addGap(18, 18, 18)
                        .addComponent(lblImageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServiceRecords))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWarrantyYear)
                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCarPhoto;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDrvingLicense;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblImageDisplay;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerTelephoneNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblServiceRecords;
    private javax.swing.JLabel lblTotalSeats;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDrivingLicense;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTotalSeats;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
    
    
    
    private void displayProduct() {
    txtAddress.setText(car.getOwnerAddress());
    txtBrand.setText(car.getBrand());
    txtColor.setText(car.getColor());
    txtDrivingLicense.setText(car.getOwnerDriverLicense());;
    txtEmailAddress.setText(car.getOwnerEmailAddresses());;
    txtEngineNo.setText(car.getEngineNo());;
    txtLicensePlate.setText(car.getLicensePlates());;
    txtModel.setText(car.getModel());;
    txtNumber.setText(car.getOwnerTelephoneNumbers());;
    txtOwnerName.setText(car.getOwnerName());;
    //txtPhoto.setText(car.getPhoto());;
    txtSSN.setText(car.getOwnerSocialSecurityNumber());;
    //txtServiceRecords.setText(car.getServiceRecords());;
    txtTotalSeats.setText(car.getSeatsNumber());;
    txtWarrantyYear.setText(car.getWarrantyYear());;
    txtYear.setText(car.getYear());;
    
    }

    public void addRowToTable(){
          //JTable  table = new JTable();
          //DefaultTableModel model = new DefaultTableModel();
          DefaultTableModel model = (DefaultTableModel) jTable.getModel();
          ls = car.getServiceRecords();
          //System.out.println(ls);
        Object rowData[] = new Object[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            rowData[0] = ls.get(i);
            model.addRow(rowData);
            System.out.println(rowData);
        
        }
    }
    
    
    private void displayImage() {                                               

//            selectedImagePath = car.getPhoto();
//            //Display image on jlable
//            ImageIcon ii = new ImageIcon(selectedImagePath);
////            Resize image to fit jlabel
            
            
            Image image = car.getPhoto();
             
            lblImageDisplay.setIcon(new ImageIcon(image));
            //System.out.println(image);
        
    } 
}
