/*slider js*/
$('#right_arrow').click(function()
{
	var currentslide = $('.slide.active');
	var nextslide = currentslide.next();

	currentslide.fadeOut(300).removeClass('active');
	nextslide.fadeIn(300).addClass('active');

	if(nextslide.length == 0)
	{
		$('.slide').first().fadeIn(300).addClass('active');
	}
});


$('#left_arrow').click(function()
{
	var currentslide = $('.slide.active');
	var prevslide = currentslide.prev();

	currentslide.fadeOut(300).removeClass('active');
	prevslide.fadeIn(300).addClass('active');

    if(prevslide.length == 0)
    {
    	$('.slide').last().fadeIn(300).addClass('active');
    }


}
);