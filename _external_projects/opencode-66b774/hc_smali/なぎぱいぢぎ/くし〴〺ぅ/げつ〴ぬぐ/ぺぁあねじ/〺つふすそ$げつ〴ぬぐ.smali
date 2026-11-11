.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ$げつ〴ぬぐ;
.super Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public ごづごきえ:Landroid/widget/TextView;

.field public ざっざへづ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;Landroid/view/View;)V
    .registers 3

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;-><init>(Landroid/view/View;)V

    sget p1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->messageLogTime:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ$げつ〴ぬぐ;->ざっざへづ:Landroid/widget/TextView;

    sget p1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->textViewMsg:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ$げつ〴ぬぐ;->ごづごきえ:Landroid/widget/TextView;

    return-void
.end method
