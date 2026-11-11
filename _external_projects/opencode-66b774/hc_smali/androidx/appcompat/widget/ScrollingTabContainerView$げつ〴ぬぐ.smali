.class public Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;
.super Landroid/widget/BaseAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget-object v0, v0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget-object v0, v0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->くし〴〺ぅ:Landroidx/appcompat/app/ActionBar$〺つふすそ;

    return-object p1
.end method

.method public getItemId(I)J
    .registers 4

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 6

    if-nez p2, :cond_2c

    iget-object p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    .line 1
    iget-object p3, p2, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    .line 2
    iget-object p1, p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->くし〴〺ぅ:Landroidx/appcompat/app/ActionBar$〺つふすそ;

    const/4 p3, 0x1

    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    invoke-virtual {p2}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p2, v1, p1, p3}, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/content/Context;Landroidx/appcompat/app/ActionBar$〺つふすそ;Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Landroid/widget/AbsListView$LayoutParams;

    const/4 p3, -0x1

    iget p2, p2, Landroidx/appcompat/widget/ScrollingTabContainerView;->〳ぜぞぜべっ:I

    invoke-direct {p1, p3, p2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object p2, v0

    goto :goto_40

    .line 4
    :cond_2c
    move-object p3, p2

    check-cast p3, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget-object v0, v0, Landroidx/appcompat/widget/ScrollingTabContainerView;->くし〴〺ぅ:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;

    .line 6
    iget-object p1, p1, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->くし〴〺ぅ:Landroidx/appcompat/app/ActionBar$〺つふすそ;

    .line 7
    iput-object p1, p3, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->くし〴〺ぅ:Landroidx/appcompat/app/ActionBar$〺つふすそ;

    invoke-virtual {p3}, Landroidx/appcompat/widget/ScrollingTabContainerView$〺つふすそ;->げつ〴ぬぐ()V

    :goto_40
    return-object p2
.end method
