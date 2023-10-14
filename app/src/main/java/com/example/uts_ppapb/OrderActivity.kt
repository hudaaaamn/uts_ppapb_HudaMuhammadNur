package com.example.uts_ppapb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_ppapb.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title=intent.getStringExtra("Title")
        val Date=intent.getStringExtra(PaymentActivity.EXTRA_DATE)
        val Time=intent.getStringExtra(PaymentActivity.EXTRA_TIME)
        val Seat=intent.getStringExtra(PaymentActivity.EXTRA_SEAT)
        val Bioskop=intent.getStringExtra(PaymentActivity.EXTRA_BIOSKOP)
        val Fee=intent.getStringExtra(PaymentActivity.EXTRA_FEE)
        val TotalPayment=intent.getStringExtra(PaymentActivity.EXTRA_TOTAL_PAYMENT)
        val NumberOfSeat=intent.getStringExtra(PaymentActivity.EXTRA_NUMBER_OF_SEAT)
        val PaymentMethod=intent.getStringExtra(PaymentActivity.EXTRA_METHOD)

        with(binding){
            titleMovie.text=title
            tvBioskop.text=Bioskop
            dateMovie.text=Date+" "+Time
            seat.text=Seat
            payment.text=Fee
            numberOfSeat.text=NumberOfSeat
            totalPayment.text=TotalPayment
            paymentMethod.text=PaymentMethod
        }
    }
}