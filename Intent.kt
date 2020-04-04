val intent = Intent(activity, ChooseExchangeActivity::class.java)
activity?.startActivity(intent)

-------------
Intent i = new Intent(this, ActivityTwo.class);
i.putExtra("Value1", "This value one for ActivityTwo ");
i.putExtra("Value2", "This value two ActivityTwo");
------------
Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vogella.com/"));
startActivity(i);
