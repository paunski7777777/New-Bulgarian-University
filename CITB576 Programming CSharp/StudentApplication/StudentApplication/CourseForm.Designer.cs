namespace StudentApplication
{
    partial class CourseForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.courseTitle = new System.Windows.Forms.Label();
            this.textBoxCourseTitle = new System.Windows.Forms.TextBox();
            this.courseCredits = new System.Windows.Forms.Label();
            this.numericUpDownCredits = new System.Windows.Forms.NumericUpDown();
            this.buttonOk = new System.Windows.Forms.Button();
            this.buttonCancel = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownCredits)).BeginInit();
            this.SuspendLayout();
            // 
            // courseTitle
            // 
            this.courseTitle.AutoSize = true;
            this.courseTitle.Location = new System.Drawing.Point(12, 53);
            this.courseTitle.Name = "courseTitle";
            this.courseTitle.Size = new System.Drawing.Size(30, 13);
            this.courseTitle.TabIndex = 0;
            this.courseTitle.Text = "Title:";
            // 
            // textBoxCourseTitle
            // 
            this.textBoxCourseTitle.Location = new System.Drawing.Point(60, 50);
            this.textBoxCourseTitle.Name = "textBoxCourseTitle";
            this.textBoxCourseTitle.Size = new System.Drawing.Size(100, 20);
            this.textBoxCourseTitle.TabIndex = 1;
            // 
            // courseCredits
            // 
            this.courseCredits.AutoSize = true;
            this.courseCredits.Location = new System.Drawing.Point(12, 94);
            this.courseCredits.Name = "courseCredits";
            this.courseCredits.Size = new System.Drawing.Size(42, 13);
            this.courseCredits.TabIndex = 2;
            this.courseCredits.Text = "Credits:";
            // 
            // numericUpDownCredits
            // 
            this.numericUpDownCredits.Location = new System.Drawing.Point(60, 92);
            this.numericUpDownCredits.Name = "numericUpDownCredits";
            this.numericUpDownCredits.Size = new System.Drawing.Size(120, 20);
            this.numericUpDownCredits.TabIndex = 3;
            // 
            // buttonOk
            // 
            this.buttonOk.DialogResult = System.Windows.Forms.DialogResult.OK;
            this.buttonOk.Location = new System.Drawing.Point(12, 229);
            this.buttonOk.Name = "buttonOk";
            this.buttonOk.Size = new System.Drawing.Size(75, 23);
            this.buttonOk.TabIndex = 4;
            this.buttonOk.Text = "Ok";
            this.buttonOk.UseVisualStyleBackColor = true;
            // 
            // buttonCancel
            // 
            this.buttonCancel.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.buttonCancel.Location = new System.Drawing.Point(200, 229);
            this.buttonCancel.Name = "buttonCancel";
            this.buttonCancel.Size = new System.Drawing.Size(75, 23);
            this.buttonCancel.TabIndex = 5;
            this.buttonCancel.Text = "Cancel";
            this.buttonCancel.UseVisualStyleBackColor = true;
            // 
            // CourseForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(287, 264);
            this.Controls.Add(this.buttonCancel);
            this.Controls.Add(this.buttonOk);
            this.Controls.Add(this.numericUpDownCredits);
            this.Controls.Add(this.courseCredits);
            this.Controls.Add(this.textBoxCourseTitle);
            this.Controls.Add(this.courseTitle);
            this.Name = "CourseForm";
            this.Text = "Course";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.CourseForm_FormClosing);
            this.Load += new System.EventHandler(this.CourseForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDownCredits)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label courseTitle;
        private System.Windows.Forms.TextBox textBoxCourseTitle;
        private System.Windows.Forms.Label courseCredits;
        private System.Windows.Forms.NumericUpDown numericUpDownCredits;
        private System.Windows.Forms.Button buttonOk;
        private System.Windows.Forms.Button buttonCancel;
    }
}