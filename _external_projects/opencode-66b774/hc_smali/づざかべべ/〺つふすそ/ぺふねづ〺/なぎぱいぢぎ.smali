.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    .registers 4

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;->〺つふすそ:Landroid/view/View;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .registers 5

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;->〺つふすそ:Landroid/view/View;

    iget-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/view/View;

    invoke-static {p1, p2, p3}, Landroidx/appcompat/app/AlertController;->くし〴〺ぅ(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .registers 3

    return-void
.end method
