val arraylist  =
            arrayListOf(
                ContextCompat.getDrawable(this,R.drawable.ic_btc)?.let {
                    DigitalCurrency(
                        it
                        ,"BTC"
                        ,"Bitcoin"
                        ,"1500","1800","0.2")
                })
        val adapter = AdapterCurrency(arraylist)
        recyclerView_frag_choose_exchange.layoutManager = LinearLayoutManager(this)
        recyclerView_frag_choose_exchange.adapter =adapter
