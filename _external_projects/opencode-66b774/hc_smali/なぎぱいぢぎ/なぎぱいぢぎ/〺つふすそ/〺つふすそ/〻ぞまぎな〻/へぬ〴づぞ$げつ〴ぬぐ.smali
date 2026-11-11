.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;
.super Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final ごづごきえ:Landroid/widget/TextView;

.field public final ざっざへづ:Lcom/google/android/material/datepicker/MaterialCalendarGridView;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Z)V
    .registers 10

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->month_title:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;->ごづごきえ:Landroid/widget/TextView;

    .line 1
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;

    sget v2, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_heading:I

    const-class v3, Ljava/lang/Boolean;

    const/16 v4, 0x1c

    invoke-direct {v1, v2, v3, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;-><init>(ILjava/lang/Class;I)V

    .line 3
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lt v3, v4, :cond_24

    const/4 v4, 0x1

    goto :goto_25

    :cond_24
    const/4 v4, 0x0

    :goto_25
    if-eqz v4, :cond_2b

    .line 5
    invoke-virtual {v1, v0, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;->びぐびあび(Landroid/view/View;Ljava/lang/Object;)V

    goto :goto_53

    :cond_2b
    const/16 v4, 0x13

    if-lt v3, v4, :cond_30

    goto :goto_31

    :cond_30
    const/4 v5, 0x0

    :goto_31
    if-eqz v5, :cond_53

    invoke-virtual {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;->づざかべべ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_53

    .line 6
    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    move-result-object v3

    if-nez v3, :cond_48

    new-instance v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-direct {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    :cond_48
    invoke-static {v0, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    .line 7
    iget v1, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->げつ〴ぬぐ:I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {v0, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぉ〲なぱぽた(Landroid/view/View;I)V

    .line 8
    :cond_53
    :goto_53
    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->month_grid:I

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/へぬ〴づぞ$げつ〴ぬぐ;->ざっざへづ:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    if-nez p2, :cond_64

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_64
    return-void
.end method
