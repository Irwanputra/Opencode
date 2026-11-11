.class public Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    iget-object p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 1
    iget-object p2, p2, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->なぎぱいぢぎ:Ljava/lang/ref/WeakReference;

    .line 2
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/bottomappbar/BottomAppBar;

    if-eqz p2, :cond_79

    instance-of p3, p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-nez p3, :cond_11

    goto :goto_79

    :cond_11
    move-object p3, p1

    check-cast p3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iget-object p4, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 3
    iget-object p4, p4, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->づざかべべ:Landroid/graphics/Rect;

    .line 4
    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredWidth()I

    move-result p5

    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result p6

    const/4 p7, 0x0

    invoke-virtual {p4, p7, p7, p5, p6}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p3, p4}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->てぜきぽく(Landroid/graphics/Rect;)V

    .line 5
    iget-object p4, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 6
    iget-object p4, p4, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->づざかべべ:Landroid/graphics/Rect;

    .line 7
    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result p4

    invoke-virtual {p2, p4}, Lcom/google/android/material/bottomappbar/BottomAppBar;->おかぷせ〱(I)Z

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;

    iget-object p5, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 8
    iget p5, p5, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->ぁごぐすすぃ:I

    if-nez p5, :cond_78

    .line 9
    invoke-virtual {p3}, Landroid/widget/ImageButton;->getMeasuredHeight()I

    move-result p5

    sub-int/2addr p5, p4

    div-int/lit8 p5, p5, 0x2

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget p6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_bottomappbar_fab_bottom_margin:I

    invoke-virtual {p4, p6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p4

    sub-int/2addr p4, p5

    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->〻ぞまぎな〻(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    move-result p5

    add-int/2addr p5, p4

    iput p5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぉ〲なぱぽた(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    move-result p4

    iput p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->ぇ〳〲〺すっ(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    move-result p4

    iput p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-static {p3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えがぐせほち(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_71

    iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 10
    iget p2, p2, Lcom/google/android/material/bottomappbar/BottomAppBar;->ておぞぞはね:I

    add-int/2addr p3, p2

    .line 11
    iput p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_78

    :cond_71
    iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 12
    iget p2, p2, Lcom/google/android/material/bottomappbar/BottomAppBar;->ておぞぞはね:I

    add-int/2addr p3, p2

    .line 13
    iput p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :cond_78
    :goto_78
    return-void

    :cond_79
    :goto_79
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method
