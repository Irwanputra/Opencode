.class public Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public ぉざぅち〻:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;

.field public ざとぅぼこ〺:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;->ざとぅぼこ〺:I

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 7

    sget v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/〳ぜぞぜべっ;->CrashReporter_Theme_NoActionBar:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/づざかべべ;->crash_reporter_activity:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    sget p1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->toolbar:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    sget v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぁごぐすすぃ;->crash_reporter:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->どぇぞほだ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぉ〲なぱぽた(Landroidx/appcompat/widget/Toolbar;)V

    .line 2
    sget p1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->viewpager:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_6f

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 3
    sget v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぁごぐすすぃ;->crashes:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぁごぐすすぃ;->exceptions:I

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->ぉ〲なぱぽた()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;[Ljava/lang/String;)V

    iput-object v1, p0, Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;->ぉざぅち〻:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;)V

    new-instance v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/くし〴〺ぅ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/くし〴〺ぅ;-><init>(Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->〺つふすそ(Landroidx/viewpager/widget/ViewPager$ぺぁあねじ;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_6a

    const-string v1, "landing"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6a

    iput v3, p0, Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;->ざとぅぼこ〺:I

    :cond_6a
    iget v0, p0, Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;->ざとぅぼこ〺:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_6f
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .registers 4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/なぎぱいぢぎ;->log_main_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 4

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->delete_crash_logs:I

    if-ne v0, v1, :cond_17

    .line 1
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;-><init>(Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_17
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
